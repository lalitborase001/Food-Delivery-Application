package com.delivery.Application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Time;

@Entity
public class Payment {

    @Id
    private Long paymentId;

    private String orderId;

    private String paymentmethod;

    private String paymentstatus;

    private String transactionId;

    private Time paymenttime;
}
