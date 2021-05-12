package com.umair.flightReservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.umair.flightReservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
