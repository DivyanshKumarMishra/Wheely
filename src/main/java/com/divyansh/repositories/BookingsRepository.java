package com.divyansh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.divyansh.models.Bookings;

@Repository
public interface BookingsRepository extends JpaRepository<Bookings, Long> {

}
