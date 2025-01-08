package com.akash.paymentservice.controllers;

import com.akash.paymentservice.dtos.InitiatePaymentDTO;
import com.akash.paymentservice.services.PaymentService;
import com.razorpay.RazorpayException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/")
    public String initiatePayment(@RequestBody InitiatePaymentDTO initiatePaymentDTO) throws RazorpayException {
        return paymentService.initiatePayment(initiatePaymentDTO.getOrderId(), initiatePaymentDTO.getEmail(), initiatePaymentDTO.getPhoneNumber(), initiatePaymentDTO.getAmount());
    }
}
