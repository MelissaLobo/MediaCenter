package controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import dao.MediaDao;
import model.Category;
import model.Media;
import validation.MediaValidation;

@Controller
public class MediaController {
	
	@Autowired
	private MediaDao mediaDao;
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.addValidators(new MediaValidation());
	
	}
	
	@RequestMapping("/newMedia")
	public ModelAndView showNewMedia(){
		ModelAndView modelAndView = new ModelAndView("newMedia");
		modelAndView.addObject("category", Category.values());
		modelAndView.addObject("tag", Category.values());
	
		return modelAndView; 
	}
	
	@RequestMapping(value="/createMedia", method=RequestMethod.POST)
	@Transactional
	public ModelAndView showCreateMedia(@Valid Media media, BindingResult result, RedirectAttributes redirectAttributes){
		
		// Verificando se tem erros de validacao
		if(result.hasErrors()){
			return showNewMedia();
		}
		
		System.out.println("Cadastrando a Midia " + media);
		mediaDao.create(media);
		redirectAttributes.addFlashAttribute("sucesso", "Produto cadastrado com sucesso!");
		return new ModelAndView("redirect:medias");
	}

	@RequestMapping(value="/medias", method = RequestMethod.GET)
	@Transactional
	public ModelAndView showListMedia(Media media){
		
		ModelAndView modelAndView = new ModelAndView("medias");
		List<Media> lista = mediaDao.findAll();
		
	/*	for(Media mediaa :lista){
			Hibernate.initialize(mediaa.getTag());
		}
		*/
		mediaDao.buscaMedia(media);
		
		modelAndView.addObject("medias", lista);
		
		return modelAndView; 
	}
}
