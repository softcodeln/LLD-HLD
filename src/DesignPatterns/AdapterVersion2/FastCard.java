package DesignPatterns.AdapterVersion2;

import DesignPatterns.AdapterVersion1.BankAPIInterface;

public class FastCard {
    private String fastCardUPI = "fastcard@upi";

    public void rechargeCard(BankAPIInterface bankAPI, String userUPI, int amount) {
        bankAPI.sendMoney(amount ,userUPI, fastCardUPI);
    }
}
