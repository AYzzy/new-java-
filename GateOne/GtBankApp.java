import java.util.Scanner;
import java.util.ArrayList;
import java.security.SecureRandom;

public class GtBankApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom number = new SecureRandom();
        ArrayList<Account> accounts = new ArrayList<>();

        System.out.println("Welcome to the World Bank");

        while (true) {
            System.out.print("Do you want to create an account (yes/no): ");
            String userInput = input.nextLine().toLowerCase();

            if (userInput.equals("yes")) {
                System.out.print("Enter first name: ");
                String firstName = input.nextLine();
                System.out.print("Enter last name: ");
                String lastName = input.nextLine();
                System.out.print("Enter your PIN: ");
                String pin = input.nextLine();

                int acctNo = number.nextInt(100000); // Generate a 5-digit account number
                System.out.println("Congratulations, " + firstName + " " + lastName + "! You have successfully created an account.");
                System.out.println("Your account number is " + acctNo);

                Account newAccount = new Account(firstName, lastName, pin, 0.0, acctNo);
                accounts.add(newAccount);

                while (true) {
                    System.out.println("Choose an action:");
                    System.out.println("1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Check Balance");
                    System.out.println("4. Transfer");
                    System.out.println("5. Change PIN");
                    System.out.println("6. Exit");
                    System.out.print("Enter your choice: ");
                    int action = input.nextInt();

                    double balance = newAccount.getBalance(); // Get balance from Account object

                    switch (action) {
                        case 1:
                            System.out.print("Enter the amount to deposit: ");
                            double depositAmount = input.nextDouble();
                            if (depositAmount > 0.0) {
                                balance += depositAmount;
                                System.out.println("Deposit successful. New balance: " + balance);
                            } else {
                                System.out.println("Invalid amount. Deposit failed.");
                            }
                            break;
                        // Implement other cases (withdraw, check balance, transfer, change PIN) similarly
                        // ...
                        case 6:
                            System.out.print("Are you sure you want to delete your account (yes/no): ");
                            input.nextLine(); // Consume newline
                            String delete = input.nextLine().toLowerCase();
                            if (delete.equals("yes")) {
                                accounts.remove(newAccount);
                                System.out.println("Account deleted successfully.");
                                return;
                            } else {
                                System.out.println("Account deletion cancelled.");
                            }
                            break;
                        default:
                            System.out.println("Invalid action. Please choose deposit, withdraw, check balance, or exit.");
                            break;
                    }
                }
            } else if (userInput.equals("no")) {
                System.out.println("Thank you for using the app. Goodbye!");
                break;
            } else {
                System.out.println("Invalid input. Please enter 'yes' oror 'no'.");
            		}

		}
		
	}

	


}
