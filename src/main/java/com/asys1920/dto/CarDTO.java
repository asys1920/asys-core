package com.asys1920.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

@Data
public class CarDTO {
    private Long id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String brand;
    @NotEmpty
    private String model;
    @Positive
    private int yearOfConstruction;
    @Positive
    private int numberOfSeats;
    @Positive
    private int numberOfDoors;
    @Positive
    private double rentingPricePerDay; //TODO: muss nicht in Car-Objekt gespeichert werden (Business Logik)
    private String vehicleType;
    private boolean isEol;
}
