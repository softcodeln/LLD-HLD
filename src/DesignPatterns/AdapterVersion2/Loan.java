package DesignPatterns.AdapterVersion2;

import DesignPatterns.AdapterVersion1.BankAPIInterface;

public class Loan {
    final int eligibleAmount = 1000000;
    boolean checkLoanEligibility(BankAPIInterface bankAPI) {
        return bankAPI.getBalanceInfo() > eligibleAmount;
    }
}
