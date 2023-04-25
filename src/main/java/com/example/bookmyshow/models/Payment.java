package com.example.bookmyshow.models;

import com.example.bookmyshow.enums.PaymentMode;
import com.example.bookmyshow.enums.PaymentStatus;
import lombok.Getter;

import java.util.Date;

@Getter
public class Payment extends BaseModel {
    private final String referenceId;

    private final Double amount;

    private final PaymentMode paymentMode;

    private final PaymentStatus status;

    public Payment(long id, Date createdAt, Date updatedAt, String referenceId, Double amount, PaymentMode paymentMode, PaymentStatus status) {
        super(id, createdAt, updatedAt);
        this.referenceId = referenceId;
        this.amount = amount;
        this.paymentMode = paymentMode;
        this.status = status;
    }
}
