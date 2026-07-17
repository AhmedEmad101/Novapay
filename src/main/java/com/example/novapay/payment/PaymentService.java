package com.example.novapay.payment;

import com.example.novapay.PaymentStrategies.AmanStrategy;
import com.example.novapay.PaymentStrategies.VodafoneCashStrategy;
import com.example.novapay.contracts.PaymentStrategy;
import com.example.novapay.payment.dto.PaymentRequest;
import com.example.novapay.payment.enums.PaymentMethod;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final List<PaymentStrategy> strategies;

    public void pay(PaymentRequest request) {

        PaymentStrategy strategy = strategies.stream()
                .filter(s -> s.getProvider() == request.getProvider())
                .findFirst()
                .orElseThrow(() ->
                        new RuntimeException("Provider not supported"));

        strategy.Pay(request);
    }
}
