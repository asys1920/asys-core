package com.asys1920.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import java.time.Instant;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Positive
    private double value;
    @Positive
    private Long userId;
    @Positive
    private Long referenceBill;
    @Basic
    private Instant creationDate;
    @Basic
    private Instant paymentDeadlineDate;
    private Boolean isPayed;
    private Boolean isCanceled;

    private String street;
    private String zipCode;
    private String city;
    private String name;
    private String country;

    public Bill cancel(){
        this.setIsCanceled(true);
        return this;
    }
}
