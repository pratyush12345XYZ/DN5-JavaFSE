package com.cognizant.adapter;

public class AdapterPatternTest {

    public static void main(String[] args) {

        PaymentProcessor payPalProcessor =
                new PayPalAdapter(new PayPalGateway());

        PaymentProcessor stripeProcessor =
                new StripeAdapter(new StripeGateway());

        payPalProcessor.processPayment(1000);

        stripeProcessor.processPayment(2000);
    }
}