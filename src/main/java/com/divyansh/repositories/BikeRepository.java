package com.divyansh.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.divyansh.models.Bike;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Long> {
	
	
}
