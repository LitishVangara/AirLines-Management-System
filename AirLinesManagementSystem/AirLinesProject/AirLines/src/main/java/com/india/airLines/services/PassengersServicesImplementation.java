package com.india.airLines.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.india.airLines.service.StaticScannerAndPrint.*;

import java.util.Optional;

import com.india.airLines.dto.BookingInformationDTO;
import com.india.airLines.dto.CheckInDTO;
import com.india.airLines.dto.PassengersDTO;

import com.india.airLines.entity.BookingInformation;
import com.india.airLines.entity.CheckIn;
import com.india.airLines.entity.Passengers;

import com.india.airLines.repository.BookingInformationRepository;
import com.india.airLines.repository.PassengersRepository;

@Service
public class PassengersServicesImplementation implements PassengersServices
{
	@Autowired
	private PassengersRepository passengersRepository;
	@Autowired
	private BookingInformationRepository bookingInformationRepository;
	@Override
	public int addPassengers(PassengersDTO passengersDTO) 
	{
		Passengers passengers = passengersRepository.save(Passengers.builder()
				.emailAddress(passengersDTO.getEmailAddress())
				.firstName(passengersDTO.getFirstName())
				.lastName(passengersDTO.getLastName())
				.mobileNumber(passengersDTO.getMobileNumber())
				.gender(passengersDTO.getGender())
				.bookingInformation(BookingInformation.builder()
						.bookingDate(passengersDTO.getBookingInformationDTO().getBookingDate())
						.destination(passengersDTO.getBookingInformationDTO().getDestination())
						.fare(passengersDTO.getBookingInformationDTO().getFare())
						.flightDate(passengersDTO.getBookingInformationDTO().getFlightDate())
						.flightNumber(passengersDTO.getBookingInformationDTO().getFlightNumber())
						.status(passengersDTO.getBookingInformationDTO().getStatus())
						.flightTime(passengersDTO.getBookingInformationDTO().getFlightTime())
						.currentCity(passengersDTO.getBookingInformationDTO().getCurrentCity())
						.build())
				.checkIn(CheckIn.builder()
						.seatNumber(passengersDTO.getCheckInDTO().getSeatNumber())
						.gateNumber(passengersDTO.getCheckInDTO().getGateNumber())
						.build())
				.build());
		println(passengers);
		return passengers.getPassengersId();
	}
	@Override
	public BookingInformationDTO findBooking(int bookingId) 
	{
		Optional<BookingInformation> bookingInformation = bookingInformationRepository.findById(bookingId);
		if (bookingInformation.isPresent()) 
		{
			BookingInformation bookingInformation2 = bookingInformation.get();
			BookingInformationDTO bookingInformationDTO = BookingInformationDTO.builder()
					.bookingDate(bookingInformation2.getBookingDate())
					.destination(bookingInformation2.getDestination())
					.fare(bookingInformation2.getFare())
					.flightDate(bookingInformation2.getFlightDate())
					.flightNumber(bookingInformation2.getFlightNumber())
					.status(bookingInformation2.getStatus())
					.flightTime(bookingInformation2.getFlightTime())
					.currentCity(bookingInformation2.getCurrentCity())
					.build();
			println(bookingInformationDTO);
			return bookingInformationDTO;
		}
		else
		{
			return null;
		}
	}
	@Override
	public PassengersDTO findPassengers(int passengersId) 
	{
		Optional<Passengers> passengers = passengersRepository.findById(passengersId);
		if (passengers.isPresent()) 
		{
			Passengers passengers2 = passengers.get();
			PassengersDTO passengersDTO = PassengersDTO.builder()
					.emailAddress(passengers2.getEmailAddress())
					.firstName(passengers2.getFirstName())
					.lastName(passengers2.getLastName())
					.mobileNumber(passengers2.getMobileNumber())
					.gender(passengers2.getGender())
					.bookingInformationDTO(BookingInformationDTO.builder()
							.bookingDate(passengers2.getBookingInformation().getBookingDate())
							.destination(passengers2.getBookingInformation().getDestination())
							.fare(passengers2.getBookingInformation().getFare())
							.flightDate(passengers2.getBookingInformation().getFlightDate())
							.flightNumber(passengers2.getBookingInformation().getFlightNumber())
							.status(passengers2.getBookingInformation().getStatus())
							.flightTime(passengers2.getBookingInformation().getFlightTime())
							.currentCity(passengers2.getBookingInformation().getCurrentCity())
							.build())
					.checkInDTO(CheckInDTO.builder()
							.seatNumber(passengers2.getCheckIn().getSeatNumber())
							.gateNumber(passengers2.getCheckIn().getGateNumber())
							.build())
					.build();
			println(passengersDTO);
			return passengersDTO;
		}
		else
		{
			return null;
		}
	}
}
