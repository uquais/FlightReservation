package com.umair.flightReservation.services;

import com.umair.flightReservation.dto.ReservationRequest;
import com.umair.flightReservation.entities.Reservation;

public interface ReservationService {

	public Reservation bookFlight(ReservationRequest request);
	
}
