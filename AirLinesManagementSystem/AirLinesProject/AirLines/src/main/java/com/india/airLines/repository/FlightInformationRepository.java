package com.india.airLines.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.india.airLines.entity.FlightInformation;

public interface FlightInformationRepository extends JpaRepository<FlightInformation, Integer>
{
	
}
