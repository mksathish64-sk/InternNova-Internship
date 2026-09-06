package Week5.Task2;

public class UPIPayment implements Payment {

    private String upiId;
    private double amount;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        this.amount = amount;
        System.out.println("UPI Payment Successful!");
    }

    @Override
    public void showPaymentDetails() {
        System.out.println("===== UPI PAYMENT DETAILS =====");
        System.out.println("UPI ID : " + upiId);
        System.out.println("Amount : ₹" + amount);
    }
}