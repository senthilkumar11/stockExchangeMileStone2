package com.premium.stc.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.premium.stc.model.Login;
@Controller
public class LoginControllerImpl implements LoginController {

	@RequestMapping(path="login", method = RequestMethod.GET)
	public String login(ModelMap model)
	{
		Login login=new Login();
		model.addAttribute("login", login);
		return "login";
	}
	@RequestMapping(path="login", method = RequestMethod.POST)
	public String loginconnect(Login login,ModelMap model)
	{
		
		if(login.getUserName().equalsIgnoreCase("user")&&login.getPassword().equals("pass"))
			return "userLandingPage";
		else
			return "redirect:login";
	}

}
