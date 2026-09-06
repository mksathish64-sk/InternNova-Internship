package Week5.Task2;

public class CardPayment implements Payment {

    private String cardNumber;
    private double amount;

    public CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        this.amount = amount;
        System.out.println("Card Payment Successful!");
    }

    @Override
    public void showPaymentDetails() {
        System.out.println("===== CARD PAYMENT DETAILS =====");
        System.out.println("Card Number : " + cardNumber);
        System.out.println("Amount      : ₹" + amount);
    }
}