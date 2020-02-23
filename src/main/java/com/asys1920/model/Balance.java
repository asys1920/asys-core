package com.asys1920.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Instant;

@Data
public class Balance {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    Double payed;
    Double open;
    Double sum;
    Instant start;
    Instant end;


}
