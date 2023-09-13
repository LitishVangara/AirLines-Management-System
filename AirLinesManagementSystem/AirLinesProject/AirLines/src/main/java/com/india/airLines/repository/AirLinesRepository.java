package com.india.airLines.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.india.airLines.entity.AirLines;

public interface AirLinesRepository extends JpaRepository<AirLines, Integer>
{
	
}
