package com.india.airLines.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class FlightsDTO 
{
	private String destination;
	private LocalDate flightDate;
	private LocalTime flightTime;
	private int flightNumber;
	private String currentLocation;
	private FareDTO fareDTO;
	private FlightInformationDTO flightInformationDTO;
	private InventoryDTO inventoryDTO;
}
