import java.util.Scanner;
import java.security.SecureRandom;
public class BankApp{
	
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	SecureRandom number = new SecureRandom();

		System.out.println("Welcome to the world bank");

		System.out.println("Enter first name: ");
		String name= input.next();
		System.out.println("Enter last name: ");
		String name1= input.next();

		System.out.println("Enter your pin: ");
		String pin = input.nextInt();

		int acctNo = number.nextInt();

		
	

	}

	


}
