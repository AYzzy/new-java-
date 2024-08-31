package bank;

import java.util.ArrayList;

public class Bank {
    public int totalAccounts =0;
    static ArrayList<Account>accounts = new ArrayList<>();
    public Account createAccounts(String firstName, String lastName, String pin) {
        String bankAccountNumber = String.valueOf(totalAccounts++);
        Account account = new Account(bankAccountNumber, firstName, lastName, pin);
        accounts.add(account);
        return account;
    }

    public int getTotalAccounts() {
        return totalAccounts ++;
    }

    public void deposit(String accountNumber,int amount) {
       Account account = findByAccountNumber(Integer.parseInt(accountNumber));
       if(account != null){
            account.deposit(amount);
       }
    }
    private static Account findByAccountNumber(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(String.valueOf(accountNumber))) {
                return account;
            }
        }
        return null;
    }


    public int getBalance(String accountNumber, String pin) {
        Account getBalance = findByAccountNumber(Integer.parseInt(accountNumber));
        if(getBalance != null && getBalance.pinVerification(pin))
            return (int) getBalance.getBalance(pin);
        return 0;
    }
}
