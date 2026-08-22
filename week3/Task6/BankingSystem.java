package week3.Task6;

public class BankingSystem {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("        BANKING SYSTEM");
        System.out.println("======================================");

        // Encapsulation
        BankAccount account = new BankAccount();

        account.setAccountNumber(100001);
        account.setAccountHolderName("Sathish");
        account.setBalance(50000.00);

        System.out.println("\n--- Account Details ---");
        account.displayDetails();

        System.out.println("\n--- Accessing Using Getters ---");
        System.out.println("Account Number : " + account.getAccountNumber());
        System.out.println("Account Holder : " + account.getAccountHolderName());
        System.out.println("Balance        : " + account.getBalance());

        // Abstraction
        System.out.println("\n--- Abstraction ---");

        SavingsAccount savingsAccount = new SavingsAccount();

        savingsAccount.displayMessage();
        savingsAccount.calculateInterest();
    }
}