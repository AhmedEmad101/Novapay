package com.example.novapay.PaymentStrategies;

import com.example.novapay.contracts.PaymentStrategy;
import com.example.novapay.payment.dto.PaymentRequest;
import com.example.novapay.payment.enums.PaymentProvider;

public class AmanStrategy implements PaymentStrategy {
    @Override
    public PaymentProvider getProvider() {
        return PaymentProvider.AMAN;
    }
    public void Pay(PaymentRequest request)
    {
        System.out.println("Aman");
    }
}
