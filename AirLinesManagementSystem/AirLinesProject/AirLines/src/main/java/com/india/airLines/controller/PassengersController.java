package com.india.airLines.controller;

import static com.india.airLines.service.StaticScannerAndPrint.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.india.airLines.dto.BookingInformationDTO;
import com.india.airLines.dto.PassengersDTO;

import com.india.airLines.services.PassengersServices;

@RestController
@RequestMapping("/passengers")
public class PassengersController 
{
	@Autowired
	private PassengersServices passengersServices;
	@PostMapping("/p1")
	public ResponseEntity<String> addPassengers(@RequestBody PassengersDTO passengersDTO)
	{
		println(passengersDTO);
		int id = passengersServices.addPassengers(passengersDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body("Id is : "+id);
	}
	@GetMapping("/p2/{bookingId}")
	public ResponseEntity<BookingInformationDTO> findBooking(@PathVariable("bookingId") int bookingId)
	{
		BookingInformationDTO bookingInformationDTO = passengersServices.findBooking(bookingId);
		if (bookingInformationDTO != null) 
		{
			println(bookingId);
			println(bookingInformationDTO);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(bookingInformationDTO);
		}
		else
		{
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
	@GetMapping("/p3/{passengersId}")
	public ResponseEntity<PassengersDTO> findPassengers(@PathVariable("passengersId") int passengersId)
	{
		PassengersDTO passengersDTO = passengersServices.findPassengers(passengersId);
		if (passengersDTO != null) 
		{
			println(passengersId);
			println(passengersDTO);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(passengersDTO);
		}
		else
		{
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
}
