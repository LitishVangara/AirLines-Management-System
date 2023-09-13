package com.india.airLines.dto;

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
public class PassengersDTO 
{
	private String emailAddress;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String gender;
	private BookingInformationDTO bookingInformationDTO;
	private CheckInDTO checkInDTO;
}
