package org.example.behavouraldesingpatterns.strategydesignpattern.strategy;

public class PaymentByPayPal implements PaymentStrategy{

    private String email;
    private String password;

    @Override
    public void pay(int amount) {
        System.out.println("Paying" + amount + "using PayPal");
    }

    @Override
    public void collectPaymentDetails() {
        email = "tastekine";
        password = "12345";
    }

    @Override
    public boolean validatePaymentDetails() {
        // validate account here
        return true;
    }
}
