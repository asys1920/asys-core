package com.asys1920.model;

import lombok.Builder;
import lombok.Data;
import lombok.With;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String brand;
    private String model;
    private int yearOfConstruction;
    private int numberOfSeats;
    private int numberOfDoors;
    private double rentingPricePerDay; //TODO: muss nicht in Car-Objekt gespeichert werden (Business Logik)
    private String vehicleType;
    private boolean isEol;
}
