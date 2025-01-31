package com.ecom.paiement_service.service;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    private static final String STRIPE_API_KEY = "your-stripe-api-key";

    public PaymentIntent createPaymentIntent(Long amount) throws StripeException {
        Stripe.apiKey = STRIPE_API_KEY;
        Map<String, Object> params = new HashMap<>();
        params.put("amount", amount);
        params.put("currency", "usd");

        PaymentIntent paymentIntent = PaymentIntent.create(params);
        return paymentIntent;
    }
}

