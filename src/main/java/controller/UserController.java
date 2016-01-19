package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.UserDao;
import model.User;

//O @Contreller avisa que a classe é uma configuração do spring e que dentro dela tem suas anotações com suas funcoes

@Controller
public class UserController {
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping("/newAccount")
	public String formNewAccount() {
		return "newAccount";
	}
	
	@RequestMapping("/account")
	public String save(User user){
		
		userDao.create(user);
		System.out.println("user");
		return "user-account";
	}
	
	@RequestMapping("/login")
	public String login(User user){
		return "login";
	}
}
