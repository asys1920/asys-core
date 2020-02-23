package com.asys1920.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.Instant;

@Data
public class BillDTO {
    Long id;
    @NotNull(message = "Bill must have a value")
    Double value;
    @NotNull(message = "Bill must belong to a user")
    Long userId;
    @NotNull(message = "Bill must have a creationDate")
    Instant creationDate;
    Instant paymentDeadlineDate;
    Boolean isPayed = false;
    Boolean isCanceled = false;

    String street;
    String zipCode;
    String city;
    String name;
    String country;
}
