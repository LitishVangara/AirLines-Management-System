package com.india.airLines.services;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.india.airLines.dto.FlightsDTO;

public interface FlightsServices 
{
	List<FlightsDTO> searchFlights(String currentLocation, String destination, LocalDate flightDate, LocalTime flightTime);
	List<FlightsDTO> searchFlight(String airLinesName, int flightNumber, LocalDate flightDate, LocalTime flightTime);
	List<FlightsDTO> searchFlightsAscending(int flightNumber, LocalTime flightTime, LocalDate flightDate);
}
