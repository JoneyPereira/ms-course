package com.redua.rhpayroll.services;

import com.redua.rhpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days){

        return new Payment("Joney", 150.00, days);
    }
}
