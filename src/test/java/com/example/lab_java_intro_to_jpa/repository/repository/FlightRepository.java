package com.example.lab_java_intro_to_jpa.repository.repository;

import com.example.lab_java_intro_to_jpa.model.Flight;

import java.util.List;

public interface FlightRepository extends Flight <Integer, String, Integer, Integer> {
    List<Flight> findByFlightNumber(String flightNumber);

    List<Flight> findByAircraftContains(String aircraftName);

    List<Flight> findByFlightMileageGreaterThan(int Mileage);

    List<Flight> findByFlightMileageLessThan(int Mileage);
}


/*
@Repository
/*public interface FlightRepository extends Repository<Flight, Integer> {
    List<Flight> findByFlightNumber(String flightNumber);
    List<Flight> findByAircraftContains(String aircraftName);
    List<Flight> findByFlightMileageGreaterThan(int Mileage);
    List<Flight> findByFlightMileageLessThan(int Mileage);*/
