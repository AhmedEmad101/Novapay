package com.example.novapay.PaymentStrategies;

import com.example.novapay.contracts.PaymentStrategy;
import com.example.novapay.payment.dto.PaymentRequest;
import com.example.novapay.payment.enums.PaymentProvider;
import com.example.novapay.payment.enums.PaymentMethod;
public class VodafoneCashStrategy implements PaymentStrategy {
    @Override
    public PaymentProvider getProvider() {
        return PaymentProvider.VODAFONE;
    }
    @Override
    public void Pay(PaymentRequest request)
    {
        switch (request.getPaymentMethod()) {

            case PaymentMethod.Wallet -> payWithWallet(request);

            case PaymentMethod.QR -> payWithQr(request);

            default ->
                    throw new UnsupportedOperationException(
                            "Vodafone does not support "
                                    + request.getPaymentMethod()
                    );
        }
    }
    private void payWithWallet(PaymentRequest request) {
        // implementation
    }

    private void payWithQr(PaymentRequest request) {
        // implementation
    }
}
