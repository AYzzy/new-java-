import java.util.Scanner;
import java.util.ArrayList;
import java.security.SecureRandom;
public class BankApp{
	
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	SecureRandom number = new SecureRandom();
	ArrayList<String> name = new ArrayList<>();
	ArrayList<String> name1 = new ArrayList<>();
	ArrayList<Integer> acctNo = new ArrayList<>();
	ArrayList<Account> accounts = new ArrayList<>();

	for (int i = 0; i < accounts.size(); i++) {
            

            Account account = new Account(name, name1, acctNo);
            accounts.add(account);
        }

	
		
		System.out.println("Welcome to the world bank");
		while (true) {
            		System.out.print("Do you want to create an account (yes/no): ");
            		String userInput = input.nextLine().toLowerCase();
			if (userInput.equals("yes")) {

				System.out.println("Enter first name: ");
				name.add(input.next());
				System.out.println("Enter last name: ");
				name1.add(input.next());

				System.out.println("Enter your pin: ");
				String pin = input.next();

				acctNo.add(number.nextInt(1000));
				System.out.println("Congratulations, " + name + " " + name1 + "! You have successfully created an account.");
				System.out.println("Your account number is " + acctNo);

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

                    			double balance = 0.0;

                    			switch (action) {
                        			case 1:
								System.out.print("How much do u want to deposit: ");
								double depositAmount = input.nextDouble();
								if (depositAmount > 0.0) System.out.println("Invalid amount");
								else balance += depositAmount;
								System.out.println("Deposit successful. New balance: " + balance);
    								break;
						case 2:
    								System.out.print("Enter the amount to withdraw: ");
    								double withdrawAmount = input.nextDouble();
    								if (balance >= withdrawAmount) {
        							balance -= withdrawAmount;
        							System.out.println("Withdrawal successful. New balance: " + balance);
    								} else {
        							System.out.println("Insufficient balance. Cannot withdraw.");
    								}
    								break;

						case 3:
    								System.out.println("Your current balance: " + balance);
    								break;
						case 5:
    								System.out.print("Enter current PIN: ");
    								String currentPin = input.next();
    								if (currentPin.equals(pin)) {
        							System.out.print("Enter new PIN: ");
        							pin = input.next();
        							System.out.println("PIN changed successfully.");
    								} else {
        							System.out.println("Incorrect current PIN. Cannot change PIN.");
    								}
    								break;
						case 6:
								System.out.print("Are you sure you want to delete your account (yes/no): ");
                    						String delete = input.nextLine().toLowerCase();
                    						if (delete.equals("yes")) {
                        					account.remove(accounts);                         
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
					
			}
			else if (userInput.equals("no")) {
                	System.out.println("Thank you for using the app. Goodbye!");
                	break;
            		} 
			else {
                	System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            		}

		}
		
	}

	


}
