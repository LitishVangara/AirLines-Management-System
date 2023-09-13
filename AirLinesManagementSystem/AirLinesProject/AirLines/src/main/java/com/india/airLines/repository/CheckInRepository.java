package com.india.airLines.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.india.airLines.entity.CheckIn;

public interface CheckInRepository extends JpaRepository<CheckIn, Integer>
{
	
}
