package com.india.airLines.entity;

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
@Table(name = "airlines")
public class AirLines 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int airLinesId;
	
	private String airLinesName;
	@OneToMany(mappedBy = "airLines")
	private List<FlightInformation> flightInformation;
}
