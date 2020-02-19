package com.asys1920.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    @Positive
    Double value;
    @Positive
    Long userId;
    @Positive
    Long referenceBill;
    @Temporal(TemporalType.DATE)
    Date creationDate;
    @Temporal(TemporalType.DATE)
    Date paymentDeadlineDate;
    Boolean isPayed;
    Boolean isCanceled;

    String street;
    String zipCode;
    String city;
    String name;
    String country;

    public Bill cancel(){
        this.setIsCanceled(true);
        return this;
    }
}
