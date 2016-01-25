package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.MediaDao;
import model.Media;

@Controller
public class MediaController {
	
	@Autowired
	private MediaDao mediaDao;
	
	@RequestMapping("/newMedia")
	public String showNewAccount(Model model){
		model.addAttribute("media", new Media());
		return "newMedia";
	}
	
	@RequestMapping("/createMedia")
	public String showNewAccount(Media media){
		mediaDao.create(media);
		return "newMedia";
	}

}
