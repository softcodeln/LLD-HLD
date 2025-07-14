package DesignPatterns.AdapterVersion2;

//import yesbankApi;

import DesignPatterns.AdapterVersion1.BankAPIInterface;

public class ICICIBankAPIAdapter implements BankAPIInterface {
    ICICIBankAPI ib = new ICICIBankAPI();
    public int getBalanceInfo(){
        return ib.fetchBalance();
    }

    public boolean sendMoney( int amount,String fromUPI, String toUPI){
        // Convert here from any type to any type
        ib.verifyAndAddDestinationUPI(toUPI);
        ib.makeTransfer(fromUPI, amount);
        return true;
    }
}