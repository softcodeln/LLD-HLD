package DesignPatterns.AdapterVersion1;

public class YesBankAPI implements BankAPIInterface{
    public int getBalanceInfo() {
        return 0;
    }

    @Override
    public boolean sendMoney(int amount, String fromUPI, String toUPI) {
        return false;
    }

}
