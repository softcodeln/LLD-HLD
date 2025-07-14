package DesignPatterns.AdapterVersion1;

public class Loan {
    final int eligibleAmount = 1000000;
    boolean checkLoanEligibility(BankAPIInterface bankAPI) {
        return bankAPI.getBalanceInfo() > eligibleAmount;
    }
}
