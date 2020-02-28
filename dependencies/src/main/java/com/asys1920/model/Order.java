package com.asys1920.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@Data
@Entity
@Table(name = "order_table") // Necessary because order as table name is not possible
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @NotNull
    private Long userId;
    @NotNull
    private Long carId;
    private Long billId;
    private Instant startDate;
    private Instant endDate;
    private boolean isCanceled;
}
