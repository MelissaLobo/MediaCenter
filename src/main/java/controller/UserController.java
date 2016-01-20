package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.UserDao;
import model.User;

//O @Contreller avisa que a classe é uma configuração do spring e que dentro dela tem suas anotações com suas funcoes

@Controller
public class UserController {
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping("/newAccount")
	public String showNewAccount(Model model){
		model.addAttribute("user", new User());
		return "newAccount";
	}
	
	@RequestMapping("/createAccount")
	public String showCreateAccount(User user){
		userDao.create(user);
		System.out.println("user");
		return "accountCreated";
	}
	
	@RequestMapping("/login")
	public String showLogin(){
		return "login";
	}
}
