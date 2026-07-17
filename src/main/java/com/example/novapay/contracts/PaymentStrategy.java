package com.example.novapay.contracts;

import com.example.novapay.payment.dto.PaymentRequest;
import com.example.novapay.payment.enums.PaymentProvider;

public interface PaymentStrategy {
    PaymentProvider getProvider();
    void Pay(PaymentRequest request);
}
