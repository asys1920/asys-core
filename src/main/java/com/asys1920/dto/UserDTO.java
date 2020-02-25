package com.asys1920.dto;

import com.asys1920.util.Regex;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.time.Instant;

@Data
public class UserDTO {
    private Long id;
    @NotEmpty(message = "Users firstname has to be provided")
    private String firstName;
    @NotEmpty(message = "Users lastname has to be provided")
    private String lastName;
    @NotEmpty(message = "User has to have a username")
    private String userName;
    @Email(message = "the field email_address requires a valid email address. E.g. a@b.com", regexp = Regex.EMAIL)
    private String emailAddress;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Instant expirationDateDriversLicense;
    private boolean isActive;
    private boolean isBanned;

    private String street;
    private String zipCode;
    private String city;
    private String country;
}
