package com.umair.flightReservation.dto;

public class ReservationRequest {
	
	private Long fligthId;
	private String passengerFirstName;
	private String passengerLastName;
	private String passengerEmail;
	private String passengerPhone;
	private String nameOnTheCard;
	private String cardNumber;
	private String expirationDate;
	private String secirityCode;
	public Long getFligthId() {
		return fligthId;
	}
	public void setFligthId(Long fligthId) {
		this.fligthId = fligthId;
	}
	public String getPassengerFirstName() {
		return passengerFirstName;
	}
	public void setPassengerFirstName(String passengerFirstName) {
		this.passengerFirstName = passengerFirstName;
	}
	public String getPassengerLastName() {
		return passengerLastName;
	}
	public void setPassengerLastName(String passengerLastName) {
		this.passengerLastName = passengerLastName;
	}
	public String getPassengerEmail() {
		return passengerEmail;
	}
	public void setPassengerEmail(String passengerEmail) {
		this.passengerEmail = passengerEmail;
	}
	public String getPassengerPhone() {
		return passengerPhone;
	}
	public void setPassengerPhone(String passengerPhone) {
		this.passengerPhone = passengerPhone;
	}
	public String getNameOnTheCard() {
		return nameOnTheCard;
	}
	public void setNameOnTheCard(String nameOnTheCard) {
		this.nameOnTheCard = nameOnTheCard;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getSecirityCode() {
		return secirityCode;
	}
	public void setSecirityCode(String secirityCode) {
		this.secirityCode = secirityCode;
	}
}
