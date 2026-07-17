package com.example.novapay.payment.enums;
import lombok.Getter;

@Getter
public enum PaymentMethod {
    CARD("Card"),
    Wallet("Wallet"),
    QR("Qr");

    private final String displayName;
    PaymentMethod(String displayName) {
        this.displayName = displayName;
    }
}