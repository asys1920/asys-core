package com.asys1920.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Positive;
import java.time.Instant;

@Data
@Entity
public class Price {
    @Id
    @GeneratedValue
    private Long id;
    @Positive
    private double value;
    private Instant creationDate;
}
