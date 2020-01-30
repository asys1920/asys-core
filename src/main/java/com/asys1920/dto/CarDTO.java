package com.asys1920.dto;

import lombok.Data;

@Data
public class CarDTO {
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
