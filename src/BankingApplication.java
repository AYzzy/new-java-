import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount bank15 = new BankAccount("En-Hakkore", "007");
        bank15.showMenu();
    }
}

class BankAccount{
    int balance;
    int previousTransaction;

    String customerName;
    String customerId;

    BankAccount(String cname, String cid){
        customerName = cname;
        customerId = cid;
    }

    void deposit(int amount){
        if(amount > 0){
            balance = balance + amount;
            previousTransaction = amount;
        }
        else{
            System.out.println("Invalid amount");
        }
    }

    void withdraw(int amount){
        if(amount <= balance && amount > 0){
            balance = balance - amount;
            previousTransaction = -amount;
        }
        else{
            System.out.println("invalid amount to withdraw");
        }
    }

    void getPreviousTransaction(){
        if(previousTransaction >0){
            System.out.println("Deposited: " + previousTransaction);
        }
        else if(previousTransaction <0){
            System.out.println("Withdraw: " + Math.abs(previousTransaction));
        }
        else{
            System.out.println("No transaction is occurred!");
        }
    }

    void showMenu(){
        char option = '\0';
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome " +customerName);
        System.out.println("Your ID is " + customerId);
        System.out.println();
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");
        try {

            do {
                System.out.println("==============================");
                System.out.println("Enter the option");
                System.out.println("==============================");
                option = sc.next().charAt(0);
                Character.toUpperCase(option);

                switch (option) {
                    case 'A':
                        System.out.println("==============================");
                        System.out.println("Balance is: " + balance);
                        System.out.println("==============================");
                        System.out.println();
                        break;


                    case 'B':
                        System.out.println("==============================");
                        System.out.println("Enter the amount to deposit");
                        System.out.println("==============================");
                        int amount = sc.nextInt();
                        deposit(amount);
                        System.out.println();
                        break;

                    case 'C':
                        System.out.println("==============================");
                        System.out.println("Enter the amount to withdraw");
                        System.out.println("==============================");
                        int amount2 = sc.nextInt();
                        withdraw(amount2);
                        System.out.println();
                        break;

                    case 'D':
                        System.out.println("==============================");
                        getPreviousTransaction();
                        System.out.println("==============================");
                        System.out.println();
                        break;

                    case 'E':
                        System.out.println("==============================");
                        break;

                    default:
                        System.out.println("Invalid Option! Please try again");
                        break;
                }
            } while (option != 'E');
        }catch (RuntimeException E) {
            throw new RuntimeException("try again");
        }
    }
}
