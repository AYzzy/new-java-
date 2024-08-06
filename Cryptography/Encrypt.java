import java.util.Scanner;		
public class Encrypt{

	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a 4 digit number: ");
	int number = input.nextInt();
		
		if(number>1000 && number<10000){

			int digit1 = number/1000;
			int digit2 = (number/100)%10;
			int digit3 = (number/10)%10;
			int digit4 = number%10;

			int encrypt1 = (digit1 + 7)%10;
			int encrypt2 = (digit2 + 7)%10;
			int encrypt3 = (digit3 + 7)%10;
			int encrypt4 = (digit4 + 7)%10;

		System.out.println(encrypt3 + encrypt4 + encrypt1 +encrypt2 );
		}
		else {
			System.out.println("Invalid input");
			
		}
	
	

	}
}