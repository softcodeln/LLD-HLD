package DesignPatterns.AdapterVersion1;

public class FastCard {
    private String fastCardUPI = "fastcard@upi";

    public void rechargeCard(BankAPIInterface bankAPI, String userUPI, int amount) {
        bankAPI.sendMoney(amount ,userUPI, fastCardUPI);
    }
}
