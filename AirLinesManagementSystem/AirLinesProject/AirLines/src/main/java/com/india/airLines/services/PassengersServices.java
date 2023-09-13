package com.india.airLines.services;

import com.india.airLines.dto.BookingInformationDTO;
import com.india.airLines.dto.PassengersDTO;

public interface PassengersServices 
{
	int addPassengers(PassengersDTO passengersDTO);
	BookingInformationDTO findBooking(int bookingId);
	PassengersDTO findPassengers(int passengersId);
}
