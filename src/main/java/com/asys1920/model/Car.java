package com.asys1920.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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
    @Positive(message = "WOLOLOLOLO")
    private double rentingPricePerDay; //TODO: muss nicht in Car-Objekt gespeichert werden (Business Logik)
    private VehicleType vehicleType;
    private boolean isEol;

}
