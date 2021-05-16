package com.umair.flightReservation.controllers;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.umair.flightReservation.dto.ReservationRequest;
import com.umair.flightReservation.entities.Flight;
import com.umair.flightReservation.entities.Reservation;
import com.umair.flightReservation.repos.FlightRepository;
import com.umair.flightReservation.services.ReservationService;

@Controller
public class ReservationController {

	@Autowired
	FlightRepository flightRespository;
	
	@Autowired
	ReservationService reservationService;
	
	@RequestMapping(value="/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long flightId, ModelMap modelMap) {
		Flight flight = flightRespository.findById(flightId).get();
		modelMap.addAttribute("flight", flight);
		return "completeReservation";
	}
	
	@RequestMapping(value="/completeReservation", method=RequestMethod.POST)
	public String completeReservation(ReservationRequest request, ModelMap modelMap) {
		
		
		Reservation reservation= reservationService.bookFlight(request);
		
		
		modelMap.addAttribute("msg", "Reservation created sucessfully and the id is " + reservation.getId());
		return "reservationConfirmation";
	}
	
}
