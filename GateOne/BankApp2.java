package GateOne;

import java.util.Scanner;
import java.util.ArrayList;
import java.security.SecureRandom;
    


    public class BankApp2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom number = new SecureRandom();
        ArrayList<Account> accounts = new ArrayList<>();
        
        System.out.println("Welcome to the World Bank");
        
        while (true) {
            System.out.print("Would you like to see the fuctionallity of our app (yes/no): ");
            String userInput = input.nextLine().toLowerCase();
            
            if (userInput.equals("yes")) {
                    System.out.println("Choose an action:");
		    System.out.println("1. Create Account");
                    System.out.println("2. Deposit");
                    System.out.println("3. Withdraw");
                    System.out.println("4. Check Balance");
		    System.out.println("5. Close Account");
                    System.out.println("6. Transfer");
                    System.out.println("7. Change PIN");
                    System.out.println("8. Exit");
                    System.out.print("Enter your choice: ");
                    int action = input.nextInt();
                    input.nextLine();
                    switch (action) {
			case 1:
				System.out.println("Enter first name: ");
                		String firstName = input.nextLine();
                		System.out.println("Enter last name: ");
                		String lastName = input.nextLine();
                		System.out.println("Enter your pin: ");
                		String pin = input.nextLine();
                		int accountNumber = number.nextInt(1000);
                		input.nextLine();                
               			Account newAccount = new Account(firstName, lastName, pin, accountNumber);
                		accounts.add(newAccount);
                
                		System.out.println("Congratulations, " + firstName + " " + lastName + "! You have successfully created an account.");
                		System.out.println("Your account number is " + accountNumber);
				break;
                        case 2: 
                            System.out.print("Enter your account number: ");
                            int accountNo = input.nextInt();
                            Account depositAccount = findAccountByNumber(accounts, accountNo);
                            if (depositAccount != null) {
                                System.out.print("Enter amount to deposit: ");
                                double depositAmount = input.nextDouble();
                                if (depositAmount >= 0) {
                                    depositAccount.balance += depositAmount;
                                    System.out.println("Deposit successful. New balance: " + depositAccount.balance);
                                } else {
                                    System.out.println("Invalid deposit amount.");
                                }
                            } else {
                                System.out.println("Account not found.");
                            }
                            break;
                        case 3: 
                            System.out.print("Enter your account number: ");
                            int withdrawAccountNumber = input.nextInt();
                            Account withdrawAccount = findAccountByNumber(accounts, withdrawAccountNumber);
			    System.out.print("Enter PIN to proceed with withdrawal: ");
            		    String pins = input.nextLine();
            		    if (newAccount.isPin(pins)) {
                            	if (withdrawAccount != null) {
                                	System.out.print("Enter amount to withdraw: ");
                                	double withdrawAmount = input.nextDouble();
                                	if (withdrawAmount <= withdrawAccount.balance) {
                                    		withdrawAccount.balance -= withdrawAmount;
                                    	System.out.println("Withdrawal successful. New balance: " + withdrawAccount.balance);
                                	} else {
                                        System.out.println("Insufficient balance.");
                                	}
                            	} else {
                                	System.out.println("Account not found.");
                            	}
			    else{
				System.out.println("Incorrect PIN.");
			    }
                            break;
                        case 4:
                            System.out.print("Enter your account number: ");
                            int balanceAccountNumber = input.nextInt();
                            Account balanceAccount = findAccountByNumber(accounts, balanceAccountNumber);
			    System.out.print("Enter PIN to close the account: ");
            		    String pins = input.nextLine();
            		    if (newAccount.isPin(pins)) {
                            	if (balanceAccount != null) {
                                	System.out.println("Current balance: " + balanceAccount.balance);
                            	} else {
                                	System.out.println("Account not found.");
                            	}
			    }else{
		 	    	System.out.println("Incorrect PIN.");
			    }
                            break;
                        case 5: 
                            System.out.println("Enter your account number: ");
			    int closeAccount = input.nextInt();
			    Account closeAccountNumber = findAccountByNumber(accounts, closeAccount);
			    if (closeAccountNumber != null) {
                                System.out.println("Are you sure you want to close this account (press yes or no))");
			    String answer = input.next();
				if (answer.equals("yes")) {
					accounts.remove(accounts);
					System.out.print("You have successfully close the account");
				
				}
				else{
					System.out.print("Operation Unsuccessful");
				}
                            } else {
                                System.out.println("Account not found.");
                            }

                            break;
			case 6:
			    System.out.println("Enter senders account number: ");
			    int sendersAccountNumber = input.nextInt();
			    Account senderAccount = findAccountByNumber(accounts, sendersAccountNumber);
			    System.out.print("Enter pin to the account: ");
                String pins = input.nextLine();
			    System.out.println("Enter receivers account number: ");
			    int receiversAccountNumber = input.nextInt();
			    System.out.print("Enter amount to transfer: ");
                double transferAmount = input.nextDouble();
			    Account receiversAccount = findAccountByNumber(accounts, receiversAccountNumber);
			    if (newAccount.isPin(pins)) {
				if(senderAccount != null){
					if(transferAmount >= senderAccount.balance){
						senderAccount.balance -= transferAmount;
                        receiversAccount.balance += transferAmount;
					}
					else{
						System.out.println("Insufficient balance");
					}
				}
				else{
					System.out.println("Account not found.");
				}
			   }
			   else{
				System.out.println("Incorrect PIN.");
			   }	
				break;
                        case 7:
                            System.out.print("Enter your account number: ");
                            int pinChangeAccountNumber = input.nextInt();
                            Account pinChangeAccount = findAccountByNumber(accounts, pinChangeAccountNumber);
                            if (pinChangeAccount != null) {
                                System.out.print("Enter current PIN: ");
                                String currentPin = input.next();
                                if (pinChangeAccount.isPin(currentPin)) {
                                    System.out.print("Enter new PIN: ");
                                    String newPin = input.next();
                                    pinChangeAccount.changePin(newPin);
                                    System.out.println("PIN changed successfully.");
                                } 
				else {
                                    System.out.println("Incorrect current PIN.");
                                }
                            } else {
                                System.out.println("Account not found.");
                            }
                            break;
                        case 8:
                            System.out.print("Are you sure you want to exit (yes/no): ");
                            String exit = input.nextLine().toLowerCase();
                            if (exit.equals("yes")) {
                                System.out.println("Thank you for using the app. Goodbye!");
                                return;
                            } else {
                                System.out.println("Unsuccessful operation");
                            }
                            break;
                        default:
                            System.out.println("Invalid action. Please choose again.");
                            break;
                    }
                
            } else if (userInput.equals("no")) {
                System.out.println("Thank you for using the app. Goodbye!");
                break;
            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
        }
    }
    

}

        private static Account findAccountByNumber(ArrayList<Account> accounts, int accountNo) {
            for (Account account : accounts) {
                if (account.accountNumber == accountNo) {
                    return account;
                }
            }
            return null;
        }
        }

