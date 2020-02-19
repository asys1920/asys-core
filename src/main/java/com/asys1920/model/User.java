package com.asys1920.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    @NotEmpty(message = "Users firstname has to be provided")
    String firstName;
    @NotEmpty(message = "Users lastname has to be provided")
    String lastName;
    @NotEmpty(message = "User has to have a username")
    String userName;
    @Pattern(regexp = "^(.+)@(.+)$")
    String emailAddress;
    //@Temporal(TemporalType.DATE)
    String expirationDateDriversLicense; //TODO: Sollte Date sein
    boolean isActive;
    boolean isBanned;


    String street;
    String zipCode;
    String city;
    String country;

    public String getName() {
        return String.format("%s %s", firstName, lastName);
    }

}
