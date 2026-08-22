package week3.Task6;

public class BankAccount {

    private long accountNumber;
    private String accountHolderName;
    private double balance;

    // Getter for Account Number
    public long getAccountNumber() {
        return accountNumber;
    }

    // Setter for Account Number
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter for Account Holder Name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Setter for Account Holder Name
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter for Balance
    public double getBalance() {
        return balance;
    }

    // Setter for Balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance        : " + balance);
    }
}