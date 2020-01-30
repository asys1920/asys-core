package com.asys1920.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Bill{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    Double value;
    Long userId;
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
