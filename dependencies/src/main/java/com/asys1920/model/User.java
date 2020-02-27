package com.asys1920.model;

import com.asys1920.util.Regex;
import lombok.Data;
import org.springframework.data.jpa.repository.Temporal;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.time.Instant;

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
    @Email(message = "the field email_address requires a valid email address. E.g. a@b.com", regexp = Regex.EMAIL)
    String emailAddress;
    Instant expirationDateDriversLicense;
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
