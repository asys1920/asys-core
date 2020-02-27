package com.asys1920.dto;

import lombok.Data;

import java.time.Instant;

@Data
public class BalanceDTO {
    private Long id;
    private double paid;
    private double open;
    private double sum;
    private Instant start;
    private Instant end;
}
