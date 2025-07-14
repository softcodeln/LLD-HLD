package DesignPatterns.AdapterVersion0;

public class PhonePe {
    YesBankAPI bankAPI = new YesBankAPI();
    Loan loan = new Loan();
    FastCard fastCard = new FastCard();
    String userUPI = "lucky@ybl";

    void checkLoanEligibility() {
        if (loan.checkLoanEligibility(bankAPI)) {
            System.out.println("Loan is eligible for " + userUPI);
        } else {
            System.out.println("Loan is not eligible for " + userUPI);
        }
    }

    void rechargeFastCard(int amount) {
        fastCard.rechargeCard(bankAPI, userUPI, amount);
    }
}
