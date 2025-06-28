package main;
// This is the main class that starts

import Bank.BankAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Lucky", 1000);

        account1.display();

        account1.deposit(-1);
        account1.display();

        account1.deposit(1000);
        account1.display();

        account1.withDraw(500);
        account1.display();

        account1.withDraw(5000);
        account1.display();

        BankAccount account2 = new BankAccount("Debu", 2000);

        account2.display();

    }
}
