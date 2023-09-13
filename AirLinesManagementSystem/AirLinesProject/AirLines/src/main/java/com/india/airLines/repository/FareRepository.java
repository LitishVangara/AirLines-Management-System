package com.india.airLines.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.india.airLines.entity.Fare;

public interface FareRepository extends JpaRepository<Fare, Integer>
{
	
}
