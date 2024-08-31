package bank;

import java.util.Objects;

public class Account {

    private String pin;
    private String accountNumber;
    private int balance =0;

    public Account(String accountNumber,String firstName,String lastName,String pin){
        this.accountNumber = accountNumber;
        this.pin = pin;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance(String pin){
        return balance;
    }

    private boolean amountIsGreaterThanZero(int amount){
        return amount > 0;
    }
    public int deposit(int amount) {
        if(amountIsGreaterThanZero(amount)) balance += amount;
        return amount;
    }

    public void withdraw(int amount,String correctPin) {

        boolean balanceIsSufficient = amount <= balance;
        if(balanceIsSufficient && amountIsGreaterThanZero(amount) && pinVerification(correctPin)) balance -= amount;
    }
    boolean pinVerification(String enteredPin){
        return Objects.equals(this.pin, enteredPin);
    }


}
