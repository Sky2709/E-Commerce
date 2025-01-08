package com.akash.paymentservice.services;

import com.akash.paymentservice.services.paymentGateways.PaymentGateway;
import com.razorpay.RazorpayException;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private final PaymentGatewayStrategy paymentGatewayStrategy;

    public PaymentService(PaymentGatewayStrategy paymentGatewayStrategy) {
        this.paymentGatewayStrategy = paymentGatewayStrategy;
    }

    public String initiatePayment(String orderId, String email, String phoneNumber, Long amount) throws RazorpayException {
        PaymentGateway paymentGateway = paymentGatewayStrategy.getBestPaymentGateway();
        return paymentGateway.generatePaymentLink(orderId, email, phoneNumber, amount);
    }
}
