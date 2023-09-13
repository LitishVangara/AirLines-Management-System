package com.india.airLines.services;

import java.util.List;

import com.india.airLines.dto.AirLinesDTO;
import com.india.airLines.dto.BookingInformationDTO;
import com.india.airLines.dto.FareDTO;
import com.india.airLines.dto.FlightInformationDTO;
import com.india.airLines.dto.FlightsDTO;
import com.india.airLines.dto.InventoryDTO;
import com.india.airLines.dto.PassengersDTO;
import com.india.airLines.dto.UserInformationDTO;

public interface AdminServices 
{
	int addFare(FareDTO fareDTO);   //1
	int addAirLines(AirLinesDTO airLinesDTO);   //2
	int addFlightInformation(FlightInformationDTO flightInformationDTO, int airLinesId);   //3
	int addInventory(InventoryDTO inventoryDTO);   //4
	int addFlight(FlightsDTO flightsDTO, int fareId, int flightInformationId, int inventoryId);   //5
	
	int addFlights(FlightsDTO flightsDTO);   //6
	
	FlightsDTO getFlights(int flightsId);   //7
	List<FlightsDTO> searchFlightNumbers(int flightNumber);   //8
	List<FlightsDTO> findAllFlights();   //9
	FlightInformationDTO getFlightInformation(int flightInformationId);   //10
	List<FlightInformationDTO> findAllFlightInformation();   //11
	List<UserInformationDTO> findAllUsers();   //12
	List<PassengersDTO> findAllPassengers();   //13
	List<BookingInformationDTO> findAllBookingDetails();   //14
	
	
	List<FlightInformationDTO> updateAirLinesName(int airLinesId, int flightInformationId, String airLinesName);   //15
	FlightsDTO updateFlightNumber(int flightsId, int flightNumber);   //16
	
	int deleteAirLines(int flightsId);   //17
	int deleteFlights(int flightsId);   //18
	int deleteUserInformation(int userInformationId);   //19
	int deletePassengers(int passengersId);   //20
}
