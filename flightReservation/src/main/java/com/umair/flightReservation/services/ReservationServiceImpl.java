 package com.umair.flightReservation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umair.flightReservation.dto.ReservationRequest;
import com.umair.flightReservation.entities.Flight;
import com.umair.flightReservation.entities.Passenger;
import com.umair.flightReservation.entities.Reservation;
import com.umair.flightReservation.repos.FlightRepository;
import com.umair.flightReservation.repos.PassengerRepository;
import com.umair.flightReservation.repos.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	PassengerRepository passengerRepository;
	
	@Autowired
	ReservationRepository reservationRepository;
	
	@Override
	public Reservation bookFlight(ReservationRequest request) {
		//Make Payment
		
		
		Long flightId= request.getFlightId();
		Flight flight= flightRepository.findById(flightId).get();
		
		
		Passenger passenger=new Passenger();
		passenger.setFirstName(request.getPassengerFirstName());
		passenger.setLastName(request.getPassengerLastName());
		passenger.setPhone(request.getPassengerPhone());
		passenger.setEmail(request.getPassengerEmail());
		Passenger savedPassenger=passengerRepository.save(passenger);
		
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(savedPassenger);
		reservation.setCheckIn(false);
		
		
		Reservation saveReservation= reservationRepository.save(reservation);
		
		return saveReservation;
	}

}
