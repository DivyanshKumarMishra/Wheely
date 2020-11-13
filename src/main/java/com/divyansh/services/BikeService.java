package com.divyansh.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divyansh.models.Bike;
import com.divyansh.repositories.BikeRepository;

@Service
public class BikeService {

	
	@Autowired
	private BikeRepository bikeRepository; 
	
	public List<Bike> getBikes(){
		return bikeRepository.findAll();
	}
}
