package DesignPatterns.AdapterVersion1;

public class ICICIBankAPI implements BankAPIInterface{
    public int getBalanceInfo() {
        return 0;
    }

    public boolean sendMoney(int amount, String fromUPI, String toUPI) {
        if (getBalanceInfo() < amount) {
            throw new RuntimeException("Insufficient balance");
        }
        return true; // Simulate successful transaction
    }
}
