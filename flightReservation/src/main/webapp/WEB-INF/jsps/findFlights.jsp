<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Find Flights</title>
</head>
<body>
<h2>Find Flights</h2>
<form action="findFlights" method="post">
From: <input type="text" name="from">
to: <input type="text" name="to">
Departure Date: <input type="text" name="departureDate">
<input type="submit" value="search">
</form>

</body>
</html>