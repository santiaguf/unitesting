package org.example.unitesting.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);
}
