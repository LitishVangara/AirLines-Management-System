package com.india.airLines.repository;

import java.time.LocalDate;
import java.time.LocalTime;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.india.airLines.entity.Flights;

public interface FlightsRepository extends JpaRepository<Flights, Integer>
{
	@Query("SELECT f1 FROM Flights f1 WHERE f1.currentLocation = :currentLocation AND f1.destination = :destination AND f1.flightDate = :flightDate AND f1.flightTime = :flightTime")
	List<Flights> searchFlights(@Param("currentLocation") String currentLocation, @Param("destination") String destination, @Param("flightDate") LocalDate flightDate, @Param("flightTime") LocalTime flightTime);
	@Query("SELECT f FROM Flights f JOIN FlightInformation fi ON f.flightInformation = fi JOIN AirLines a ON fi.airLines = a WHERE a.airLinesName = :airLinesName AND f.flightNumber = :flightNumber AND f.flightDate = :flightDate AND f.flightTime = :flightTime")
	List<Flights> searchflight(@Param("airLinesName") String airLinesName, @Param("flightNumber") int flightNumber, @Param("flightDate") LocalDate flightDate, @Param("flightTime") LocalTime flightTime);
	@Query("SELECT fl FROM Flights fl WHERE fl.flightNumber = :flightNumber  AND fl.flightTime = :flightTime AND fl.flightDate = :flightDate")
	List<Flights> searchFlightsAscending(@Param("flightNumber") int flightNumber, @Param("flightTime") LocalTime flightTime, @Param("flightDate") LocalDate flightDate);
	@Query("SELECT fn FROM Flights fn WHERE fn.flightNumber = :flightNumber")
	List<Flights> searchFlightNumbers(@Param("flightNumber") int flightNumber);
}
