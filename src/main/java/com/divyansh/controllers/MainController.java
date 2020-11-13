package com.divyansh.controllers;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
    @GetMapping("/index")
    public String root() {
        return "index";
    }

    @GetMapping("/login")
    public ModelAndView login(HttpServletResponse response) {
    	
    	return new ModelAndView("login");   	  
 }   
    
    @GetMapping("/logout")
    public ModelAndView logout(HttpServletResponse response) {
    	
    	return new ModelAndView("login");   	  
 }   
        
}
