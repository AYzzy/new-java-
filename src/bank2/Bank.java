package bank2;

import java.util.ArrayList;

public class Bank {

    ArrayList <Account> account = new ArrayList<>();

    public Account createAccount(String firstName, String lastName, String pin) {
        Account accounts = new Account(account.size()+1, firstName, lastName, pin);
        account.add(accounts);
        return accounts;
    }

    public int getCountOfAccounts() {
        return account.size();
    }

    public void deposit(int accountNumber, int amount) {
        account.get(accountNumber-1).deposit(amount);
    }

    public int checkBalance(int accountNumber) {
        return account.get(accountNumber-1).getBalance("pin");
    }

    public void withdraw(int accountNumber, int amount, String pin) {
        account.get(accountNumber-1).withdraw(amount, pin);
    }

    public void transfer(int senderAccountNumber, int receiverAccountNumber, int amount, String senderPin) {
        account.get(senderAccountNumber-1).withdraw(amount, senderPin);
        account.get(receiverAccountNumber-1).deposit(amount);
    }

    public void checkPin(int accountNumber, String correctPin, String newPin) {
        account.get(accountNumber-1).changePin(correctPin, newPin);
    }

    public void closeAccount(int accountNumber, String correctPin) {

    }

    public boolean closedAccount(int accountNumber) {
        return true;
    }
}
