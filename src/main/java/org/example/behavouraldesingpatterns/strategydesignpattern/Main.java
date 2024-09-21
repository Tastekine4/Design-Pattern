package org.example.behavouraldesingpatterns.strategydesignpattern;

import org.example.behavouraldesingpatterns.strategydesignpattern.strategy.PaymentByCreditCard;

public class Main {

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        paymentService.setStrategy(new PaymentByCreditCard());

        paymentService.setCost(100);
        paymentService.processOrder();
    }
}
