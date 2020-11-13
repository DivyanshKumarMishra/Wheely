package com.divyansh.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.divyansh.models.Bike;
import com.divyansh.models.Rental;
import com.divyansh.services.BikeService;
import com.divyansh.services.RentalService;
import com.divyansh.services.RentalServiceImpl;

@Controller
public class RentalController {
	
	@Autowired
	private BikeService bikeService;	
	
	@Autowired
	private RentalService rentalService;	
	
	@Autowired
	private RentalServiceImpl rentalServiceImpl;
	
	@GetMapping("/bookings")
    public String getBookings(Model model) {
    
		List<Rental> bookingsList= rentalServiceImpl.getBookings();
		model.addAttribute("bookings",bookingsList);
		return "bookings";
	}
	

	@GetMapping("/rental")
	public String getBikes(Model model) {			
        
		List<Bike> bikeList= bikeService.getBikes();
		model.addAttribute("bikes",bikeList);
		
		Rental rental = new Rental();
		model.addAttribute("rental",rental);
		
		return "rental";
}	
	
	@PostMapping("/save")
	public String save(@ModelAttribute("rental") Rental rental) {
		
		rentalService.save(rental);
		return "redirect:rental?success";
	}
}