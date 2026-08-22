package week3.Task3;

public class BankAccount {

    String accountHolderName;
    long accountNumber;
    double balance;

    // static variable shared by all objects
    static int totalAccounts = 0;

    // Parameterized Constructor
    BankAccount(String accountHolderName, long accountNumber, double balance) {

        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;

        totalAccounts++;
    }

    void displayDetails() {
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : " + balance);
        System.out.println("-----------------------------------");
    }
}
