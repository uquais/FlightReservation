package com.umair.flightReservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umair.flightReservation.dto.ReservationUpdateRequest;
import com.umair.flightReservation.entities.Reservation;
import com.umair.flightReservation.repos.ReservationRepository;

@RestController
public class ReservationRestController {

	@Autowired
	ReservationRepository reservationRepository;
	
	@RequestMapping ("/reservations/{id}")
	public Reservation findReservation (@PathVariable("id") Long id){
		return reservationRepository.findById(id).get();
	}
	
	@RequestMapping ("/reservations")
	public Reservation updateReservatio(@RequestBody ReservationUpdateRequest request) {
		Reservation reservation = reservationRepository.findById(request.getId()).get();
		reservation.setNumberOfBags(request.getNumberOfBags());
		reservation.setCheckIn(request.getCheckIn());
		return reservationRepository.save(reservation);
	}
		
		
}
	

