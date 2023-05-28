package com.example.rest.services.services;


import com.example.rest.services.exceptions.NotEnoughMoneyException;
import com.example.rest.services.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}
