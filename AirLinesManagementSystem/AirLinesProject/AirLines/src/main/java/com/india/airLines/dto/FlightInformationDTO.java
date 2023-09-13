package com.india.airLines.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
public class FlightInformationDTO 
{
	private int flightNumber;
	private String flightType;
	private AirLinesDTO airLinesDTO;
	@JsonIgnore
	private FlightsDTO flightsDTO;
}
