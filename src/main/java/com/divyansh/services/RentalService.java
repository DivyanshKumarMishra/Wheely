package com.divyansh.services;

import java.util.List;

import com.divyansh.models.Rental;

public interface RentalService {

	void save(Rental rental);
	
	List<Rental> getBookings();
}
