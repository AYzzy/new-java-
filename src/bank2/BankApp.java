package bank2;

import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {
        gotoMainMenu();
    }


    private static void gotoMainMenu() {
        String Menu = """
               Welcome to the Bank App
               1 -> Create An Account
               2 -> Deposit Money
               3 -> Withdraw Money
               4 -> Transfer Money
               5 -> Change Pin
               6 -> Exit Program
               
               """;
        System.out.println(Menu);
        char userInput = input("PROMPT").charAt(0);
        switch (userInput) {
            case 1: createAnAccount();
            case 2: deposit();
            case 3: withdraw();
            case 4: transfer();
            case 5: changePin();
            case 6: exit();
            default: System.out.println("Invalid input");
            gotoMainMenu();
        }
    }
    private static void exit(){
        System.exit(69);
    }

    private static void changePin() {
        Bank bank = new Bank();
        int accountNo = Integer.parseInt(input("Enter yah account number: "));
        String OldPin = input("Enter your old pin number: ");
        String NewPin = input("Enter your new pin number: ");
        bank.checkPin(accountNo, OldPin, NewPin);
        gotoMainMenu();
    }

    private static void transfer() {
        Bank bank = new Bank();
        int senderAccountNo = Integer.parseInt(input("Enter yah Account number: "));
        int receiverAccountNo = Integer.parseInt(input("Enter yah receiver Account number: "));
        int amount = Integer.parseInt(input("Enter amount yah want to send : "));
        String pin = input("Enter your PIN: ");
        bank.transfer(senderAccountNo, receiverAccountNo,amount, pin);
        gotoMainMenu();
    }

    private static void withdraw() {
        Bank bank = new Bank();
        int accountNo = Integer.parseInt(input("Enter yah account number: "));
        int amount = Integer.parseInt(input("Enter your amount to withdraw: "));
        String pin = input("Enter your pin: ");
        bank.withdraw(accountNo, amount, pin);
        gotoMainMenu();
    }

    private static void deposit() {
        Bank bank = new Bank();
        int accountNo = Integer.parseInt(input("Enter yah account number: "));
        int amount = Integer.parseInt(input("Enter your amount to deposit: "));
        bank.deposit(accountNo, amount);
        gotoMainMenu();
    }

    private static void createAnAccount() {
        Bank bank = new Bank();
        String firstName = input("Enter yah name:");
        String lastName = input("Enter your last name:");
        String pin = input("Enter yah pin:");
        bank.createAccount(firstName, lastName, pin);
        gotoMainMenu();
    }

    private static String input(String homePrompt) {
        print(homePrompt);
        return new Scanner(System.in).nextLine();
    }
    private static void print(String prompt) {
        System.out.println(prompt);
    }
}
