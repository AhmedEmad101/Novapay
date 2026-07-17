package com.example.novapay.payment.dto;
import com.example.novapay.payment.enums.PaymentMethod;
import com.example.novapay.payment.enums.PaymentProvider;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class PaymentRequest {
    private Long fromUserId;
    private Long toUserId;
    private BigDecimal amount;
    private PaymentProvider provider;
    private PaymentMethod paymentMethod;
}
