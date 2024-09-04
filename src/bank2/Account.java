package bank2;

import java.util.Objects;

public class Account {

    private int balance;
    private String pin;
    private int accountNumber;
    private String firstName;
    private String lastName;

    public Account(int accountNumber, String firstName, String lastName, String correctPin) {
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        balance = 0;
        pin = correctPin;
    }

    public int getBalance(String pin) {
        return balance;
    }

    public void deposit(int amount) {
        if(amountGreaterThanZero(amount)) balance = balance + amount;
    }
    private boolean amountGreaterThanZero(int amount){
        return amount > 0;
    }

    public void withdraw(int amount,String correctPin) {
        boolean balanceSufficientThanAmount = amount <= balance;
        if(balanceSufficientThanAmount && amountGreaterThanZero(amount) && Objects.equals(pin, correctPin)) balance = balance - amount;
    }

    public void changePin(String correctPin, String newPin) {
        if(pin.equals(correctPin)) pin = newPin;
    }

    public void createAccount( String correctPin) {
        pin = correctPin;
    }


}



