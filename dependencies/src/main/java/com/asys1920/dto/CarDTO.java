package com.asys1920.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

@Data
public class CarDTO {
    private Long id;
    @NotEmpty(message = "Car name has to be provided")
    private String name;
    @NotEmpty(message = "Car brand has to be provided")
    private String brand;
    @NotEmpty(message = "Car model has to be provided")
    private String model;
    @Positive(message = "Car yearOfConstruction has to be positive")
    private int yearOfConstruction;
    @Positive
    private int numberOfSeats;
    @Positive
    private int numberOfDoors;
    @Positive
    double carBaseRentPrice;
    private String vehicleType;
    private boolean isEol;
}
