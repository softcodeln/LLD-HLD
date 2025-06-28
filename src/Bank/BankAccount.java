package Bank;
import java.util.UUID;

public class BankAccount {
    String name;
    String accountNo;
    double balance;

    public static void boo(int x){
        System.out.println("boo called with " + x);
    }

    public static void boo(){
        System.out.println("boo called with no args");
    }

    public BankAccount(){
        this.name = null;
        this.balance = 0.0;
        this .accountNo = UUID.randomUUID().toString();
    }

    public BankAccount(String name, int balance){
        this.name = name;
        this.accountNo = UUID.randomUUID().toString();
        this.balance = balance;
    }


    public void withDraw(int amt){
        if(amt > balance){
            System.out.println("Insufficient balance to withDraw Rs." + amt);
        }
        else{
            this.balance -= amt;
            System.out.println("Account Debited with " + amt + " and available balance is " + this.balance);
        }
    }

    public void deposit(int amt){
        if(amt <= 0){
            System.out.println("Rs."+ amt + " Invalid amount to deposit");
        }
        else{
            this.balance += amt;
            System.out.println("Account Credited with " + amt + " and available balance is " + this.balance);
        }
    }

    public void display(){
        System.out.println("Account Holder Name: " + this.name);
        System.out.println("Account Number: " + this.accountNo);
        System.out.println("Available Balance: " + this.balance);
    }

}
