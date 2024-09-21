package org.example.behavouraldesingpatterns.strategydesignpattern.strategy;

public class PaymentByCreditCard implements PaymentStrategy {

     private CreditCard card;

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + "$ using Credit Card");
        card.setAmount(card.getAmount() - amount);
    }

    @Override
    public void collectPaymentDetails() {
        // Pop-up to collect card details.
        card = new CreditCard("cardNum", "expireDate", "cvv");
    }

    @Override
    public boolean validatePaymentDetails() {
        // validate credit card here
        return true;
    }
}
