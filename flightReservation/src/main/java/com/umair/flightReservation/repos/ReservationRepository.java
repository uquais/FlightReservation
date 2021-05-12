package com.umair.flightReservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.umair.flightReservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
