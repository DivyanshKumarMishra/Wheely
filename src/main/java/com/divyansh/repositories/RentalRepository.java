package com.divyansh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.divyansh.models.Rental;

@Repository
public interface RentalRepository extends JpaRepository<Rental, Long> {

}
