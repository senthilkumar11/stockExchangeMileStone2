package com.premium.stc.controller;

import org.springframework.ui.ModelMap;

import com.premium.stc.model.*;

public interface UserController {
	 public String registerUser(ModelMap model) throws Exception;
	 public User updateUser(User user)throws Exception;
	 
	 
}
