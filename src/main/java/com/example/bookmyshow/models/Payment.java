package com.example.bookmyshow.models;

import com.example.bookmyshow.enums.PaymentMode;
import com.example.bookmyshow.enums.PaymentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.Getter;

import java.util.Date;

@Getter
@Entity
public class Payment extends BaseModel {
    private final String referenceId;

    private final Double amount;

    @Enumerated
    private final PaymentMode paymentMode;

    @Enumerated
    private final PaymentStatus status;

    public Payment(long id, Date createdAt, Date updatedAt, String referenceId, Double amount, PaymentMode paymentMode, PaymentStatus status) {
        super(id, createdAt, updatedAt);
        this.referenceId = referenceId;
        this.amount = amount;
        this.paymentMode = paymentMode;
        this.status = status;
    }
}
