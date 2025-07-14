package DesignPatterns.AdapterVersion0;

public class ICICIBankAPI {
    public int fetchBalance() {
        return 0;
    }

    public void makeTransfer(String fromUPI, String toUPI, int amount) {
        if (fetchBalance() < amount) {
            throw new RuntimeException("Insufficient balance");
        }
    }
}
