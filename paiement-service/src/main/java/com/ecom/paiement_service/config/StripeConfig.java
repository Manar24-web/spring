package com.ecom.paiement_service.config;

import com.stripe.Stripe;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StripeConfig {

    @Value("${stripe.api.key}")
    private String stripeApiKey;

    @Bean
    public void stripeConfiguration() {
        // Configure Stripe API avec ta clé secrète
        Stripe.apiKey = stripeApiKey;
    }
}

