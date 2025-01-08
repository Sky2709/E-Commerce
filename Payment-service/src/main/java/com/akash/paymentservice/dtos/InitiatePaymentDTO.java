package com.akash.paymentservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InitiatePaymentDTO {
    private String orderId;
    private String email;
    private String phoneNumber;
    private Long amount;

    public InitiatePaymentDTO(String orderId, String email, String phoneNumber, Long amount) {
        this.orderId = orderId;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.amount = amount;
    }

}
