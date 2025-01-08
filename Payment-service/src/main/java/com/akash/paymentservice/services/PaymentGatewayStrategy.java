package com.akash.paymentservice.services;

import com.akash.paymentservice.services.paymentGateways.PaymentGateway;
import com.akash.paymentservice.services.paymentGateways.Razorpay;
import org.springframework.stereotype.Service;

@Service
public class PaymentGatewayStrategy {
    private Razorpay razorPay;

    public PaymentGatewayStrategy(Razorpay razorPay) {
        this.razorPay = razorPay;
    }

    public PaymentGateway getBestPaymentGateway() {
       return razorPay;
    }
}
