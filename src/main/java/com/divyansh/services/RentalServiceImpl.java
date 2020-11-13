package com.divyansh.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divyansh.models.Rental;
import com.divyansh.repositories.RentalRepository;

@Service
public class RentalServiceImpl implements RentalService {

	@Autowired
	private RentalRepository rentalRepository;
	
	
	@Override
	public void save(Rental rental) {
		this.rentalRepository.save(rental);
	}
	
	public List<Rental> getBookings(){
		return rentalRepository.findAll();
	}
	
}
