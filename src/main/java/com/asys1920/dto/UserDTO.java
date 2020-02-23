package com.asys1920.dto;

import com.asys1920.util.Regex;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.time.Instant;

@Data
public class UserDTO {
    Long id;
    @NotEmpty(message = "Users firstname has to be provided")
    String firstName;
    @NotEmpty(message = "Users lastname has to be provided")
    String lastName;
    @NotEmpty(message = "User has to have a username")
    String userName;
    @Email(message = "the field email_address requires a valid email address. E.g. a@b.com", regexp = Regex.EMAIL)
    String emailAddress;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    Instant expirationDateDriversLicense;
    boolean isActive;
    boolean isBanned;

    String street;
    String zipCode;
    String city;
    String country;
}
