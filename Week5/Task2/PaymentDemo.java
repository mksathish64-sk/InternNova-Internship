package Week5.Task2;

public class PaymentDemo {

    public static void main(String[] args) {

        Payment upi = new UPIPayment("sathish@upi");
        upi.pay(1500);
        upi.showPaymentDetails();

        System.out.println();

        Payment card = new CardPayment("1234-5678-9012");
        card.pay(2500);
        card.showPaymentDetails();
    }
}