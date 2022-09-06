package org.example.unitesting.payments;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentRequestTest {

    @Test
    public void return_amount() {
        PaymentRequest paymentRequest = new PaymentRequest(6);
        assertTrue("is double", paymentRequest.getAmount() == 6);
    }
}