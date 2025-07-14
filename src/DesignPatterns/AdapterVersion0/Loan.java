package DesignPatterns.AdapterVersion0;

public class Loan {
    final int eligibleAmount = 1000000;
    boolean checkLoanEligibility(YesBankAPI bankAPI) {
        return bankAPI.getBalance() > eligibleAmount;
    }
}
