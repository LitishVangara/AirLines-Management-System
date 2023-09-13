package com.india.airLines.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
@Table(name = "checkin")
public class CheckIn 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int checkInId;
	
	private int seatNumber;
	private int gateNumber;
	@OneToOne(mappedBy = "checkIn")
	private Passengers passengers;
}
