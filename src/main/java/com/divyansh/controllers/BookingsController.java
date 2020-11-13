package com.divyansh.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.divyansh.models.Bookings;
import com.divyansh.services.BikeService;
import com.divyansh.services.BookingsService;
import com.divyansh.services.UserService;
import com.divyansh.services.UserServiceImpl;

@Controller
public class BookingsController {
/*
	@Autowired private BookingsService bookingsService;
	@Autowired private BikeService bikeService;
	@Autowired private UserServiceImpl userServiceImpl;
	
	@GetMapping("/bookings")
	public String getBookingss(Model model) {
		
	model.addAttribute("bookings" , bookingsService.getBookings());
	model.addAttribute("bookings" , bookingsService.getBikes());
	model.addAttribute("bookings" , bookingsService.getUsers());
	
	return "bookings";
*/
}

