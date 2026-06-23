package com.cognizant.strategy;

public class PayPalPayment implements PaymentStrategy {

    public void pay(double amount) {

        System.out.println(
                "Paid Rs." + amount +
                " using PayPal");
    }
}
