package com.akash.paymentservice.controllers;

import com.akash.paymentservice.dtos.InitiatePaymentDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/razorPayPGUpdate")
public class RazorPayWebHookController {
    @GetMapping("/")
    public void receiveRazorPayWebHook() {
    }
}
