package DesignPatterns.AdapterVersion0;

public class YesBankAPI {
    public int getBalance() {
        return 0;
    }

    boolean transferAmount(String fromUPI, String toUPI, int amount) {
        return false;
    }
}
