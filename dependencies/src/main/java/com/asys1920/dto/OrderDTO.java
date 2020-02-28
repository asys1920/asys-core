package com.asys1920.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.Instant;

@Data
public class OrderDTO {
    private Long id;
    private Long userId;
    private Long carId;
    private Long billId;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private String startDate;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private String endDate;
    private boolean isCanceled;
}
