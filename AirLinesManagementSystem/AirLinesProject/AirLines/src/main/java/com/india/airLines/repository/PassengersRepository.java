package com.india.airLines.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.india.airLines.entity.Passengers;

public interface PassengersRepository extends JpaRepository<Passengers, Integer>
{
	
}
