package org.example.behavouraldesingpatterns.strategydesignpattern.strategy;

public interface PaymentStrategy {

    void pay(int amount);

    void collectPaymentDetails();

    boolean validatePaymentDetails();
}
