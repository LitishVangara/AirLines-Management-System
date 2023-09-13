package com.india.airLines.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

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
@Entity
@Builder
@Table(name = "bookinginformation")
public class BookingInformation 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookingId;
	
	private LocalDate bookingDate;
	private String destination;
	private double fare;
	private LocalDate flightDate;
	private int flightNumber;
	private String status;
	private LocalTime flightTime;
	private String currentCity;
	@OneToMany(mappedBy = "bookingInformation")
	private List<Passengers> passengers;
}
