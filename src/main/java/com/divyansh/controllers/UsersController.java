package com.divyansh.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.divyansh.models.User;
import com.divyansh.services.UserServiceImpl;

@Controller
public class UsersController {
	
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@GetMapping("/users")
    public String getUsers(Model model) {
    
		List<User> userList= userServiceImpl.getUsers();
		model.addAttribute("users",userList);
		return "users";
	}
}
