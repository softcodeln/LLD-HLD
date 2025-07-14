package DesignPatterns.AdapterVersion2;

import DesignPatterns.AdapterVersion1.BankAPIInterface;

public class Phonepe {
    BankAPIInterface bankAPI = new ICICIBankAPIAdapter();
    Loan loan = new Loan();
    FastCard fastCard = new FastCard();
    String userUPI = "lucky@ybl";

    public void checkLoanEligibility() {
        if (loan.checkLoanEligibility(bankAPI)) {
            System.out.println("Loan is eligible");
        } else {
            System.out.println("Loan is not eligible");
        }
    }

    public void rechargeCard(int amount) {
        fastCard.rechargeCard(bankAPI, userUPI, amount);
    }
}
