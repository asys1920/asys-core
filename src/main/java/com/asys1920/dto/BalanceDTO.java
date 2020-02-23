package com.asys1920.dto;

import lombok.Data;

import java.time.Instant;
import java.util.Date;

@Data
public class BalanceDTO {
    Long id;
    Double payed;
    Double open;
    Double sum;
    Instant start;
    Instant end;

}
