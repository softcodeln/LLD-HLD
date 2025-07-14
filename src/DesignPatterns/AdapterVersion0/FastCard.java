package DesignPatterns.AdapterVersion0;

public class FastCard {
    private String fastCardUPI = "fastcard@upi";

    public void rechargeCard(YesBankAPI bankUPI, String userUPI, int amount) {
        bankUPI.transferAmount(userUPI, fastCardUPI, amount);
    }
}
