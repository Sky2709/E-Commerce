package com.akash.paymentservice.services.paymentGateways;

import com.razorpay.RazorpayException;
import org.springframework.stereotype.Service;


public interface PaymentGateway {

    String generatePaymentLink(String orderId, String email, String phoneNumber, Long amount) throws RazorpayException;

    boolean validatePayment();
}
