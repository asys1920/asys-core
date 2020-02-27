package com.asys1920.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.Instant;

@Data
public class BillDTO {
    private Long id;
    @NotNull(message = "Bill must have a value")
    private double value;
    @NotNull(message = "Bill must belong to a user")
    private Long userId;
    @NotNull(message = "Bill must have a creationDate")
    private Instant creationDate;
    private Instant paymentDeadlineDate;
    private boolean isPaid = false;
    private boolean isCanceled = false;

    private String street;
    private String zipCode;
    private String city;
    private String name;
    private String country;
}
