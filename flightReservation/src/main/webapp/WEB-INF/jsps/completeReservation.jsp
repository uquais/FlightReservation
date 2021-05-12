<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>complete Reservation</title>
</head>
<body>
<h2>Complete Reservation</h2>
Airline: ${flight.operatingAirlines}<br/>
Departure City: ${flight.departureCity}<br/>
Arrival City: ${flight.arrivalCity}<br/>

<form action="completeReservation" method="post">
<pre>
<h2>Passenger Details</h2>
First Name:<input type="text" name="passengerFirstName"/>
Last Name:<input type="text" name="passengerLastName"/>
Email:<input type="text" name="passengerEmail"/>
Phone:<input type="text" name="passengerPhone"/>

<h2>Card Details:</h2>
Name on the Card<input type="text" name="nameOnTheCard"/>
Card number<input type="text" name="cardNumber"/>
ExpiryDate<input type="text" name="expirationDate">
Three digit sec code <input type="text" name="securityCode"/>
<input type="hidden" name="flightId" value="${flight.Id}"/>
<input type="submit" value="confirm"/>
</pre>
</form>
</body>
</html>