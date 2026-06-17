package com.cognizant.adapter;

public class StripeGateway {

    public void pay(double amount) {
        System.out.println("Processing payment of Rs." + amount + " using Stripe Gateway");
    }
}