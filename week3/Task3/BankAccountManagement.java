package week3.Task3;

public class BankAccountManagement {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(
                "Sathish",
                100001,
                25000.00
        );

        BankAccount account2 = new BankAccount(
                "Arun",
                100002,
                30000.00
        );

        BankAccount account3 = new BankAccount(
                "Karthik",
                100003,
                45000.00
        );

        System.out.println("======================================");
        System.out.println("          BANK ACCOUNT DETAILS");
        System.out.println("======================================");

        account1.displayDetails();
        account2.displayDetails();
        account3.displayDetails();

        System.out.println("Total Number of Accounts : "
                + BankAccount.totalAccounts);
    }
}
