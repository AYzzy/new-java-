import java.util.Scanner;
import java.util.Arrays;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class CheckOut{

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String [] itemsBought = new String [20];
	int [] piecesBought = new int [20];
	double [] pricePerUnit = new double [20];
	double [] totalPerUnit = new double [20];
	String cashierName="";
	double discount =0;

	LocalDateTime localDateTime = LocalDateTime.now() ;
	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
	String dateTime = localDateTime.format(dateTimeFormatter) ;

	System.out.println("Welcome to Semicolon Store");
	System.out.println(" ");

	System.out.println("What is the customer's Name?") ;
	String customerName = input.nextLine();
		int counter = 0;
		int index = 0;

		while (counter != -1) {	
			System.out.println("What did the user buy?");
			String itemBought =input.next() ;
			itemsBought[index] = itemBought;

			System.out.println("How many pieces?");
			int pieceBought = input.nextInt() ;
			piecesBought[index] = pieceBought; 

			System.out.println("How much per unit? ") ;
			double price = input.nextDouble() ;
			pricePerUnit[index] = price ;

			double itemTotalPrice = pieceBought * price ;
			totalPerUnit[index] = itemTotalPrice ;

			System.out.println("Would you like to Add more items?") ;
			String moreItem = input.next() ;

			if (moreItem.equals( "yes")) {
				counter ++ ;
				index ++ ;
			} else {	
					counter = -1;
					System.out.println("\n\nWhat is your name?") ;
					cashierName = input.next() ;

					System.out.println("How much discount will he get?") ;
					discount = input.nextInt() ;

					System.out.println() ;
				
			}
		}
		System.out.println("SEMICOLON STORES \nMAIN BRANCH \nLOCATION: 312, HERBERT MACAULEY WAY, SABO YABA, LAGOS. \nTEL: 03293828343") ;
		System.out.println("Date: " + dateTime) ;
		System.out.printf("Cashier: %s \nCustomer Name: %s \n", cashierName, customerName) ;
		System.out.println("========================================================") ;
		System.out.printf("%20s%10s%10s%15s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)") ;
		System.out.println("--------------------------------------------------------") ;
		
		for (int item = 0; item <= index; item++) {
			System.out.printf("%20s%10d%10.2f%15.2f%n", itemsBought[item], piecesBought[item], pricePerUnit[item], totalPerUnit[item]) ;
		}

		System.out.println("\n--------------------------------------------------------") ;
		
		double subTotal = 0 ;
		for (int price = 0; price <= totalPerUnit.length - 1; price ++) {
			subTotal += totalPerUnit[price];
		}

		double discountPrice = (subTotal * discount) / 100 ;
		double vAT =  subTotal * 0.075 ;
		double total = (subTotal - discountPrice) + vAT ;
		
		System.out.printf("%45s%10.2f%n%45s%10.2f%n%45s%10.2f%n", "Sub Total: ", subTotal, "Discount:", discountPrice, "VAT @ 7.50%:",vAT) ;
		System.out.println("========================================================") ;
		System.out.printf("%45s%10.2f%n", "Bill Total:", total) ;
		System.out.println("========================================================") ;
		System.out.printf("THIS IS NOT A RECEIPT, KINDLY PAY %.2f%n", total) ;
		System.out.println("========================================================\n\n") ;

		System.out.println("How much did the customer give to you?");
		double amountPaid = input.nextInt() ;
		
		while (amountPaid < total) {
			System.out.println("Your payment is not up to what you purchased") ;
			System.out.println("Enter a new amount: ");
			amountPaid = input.nextInt() ;
		}
		double balance = amountPaid - total ;

		System.out.println("\n\n"); 

		System.out.println("SEMICOLON STORES \nMAIN BRANCH \nLOCATION: 312, HERBERT MACAULEY WAY, SABO YABA, LAGOS. \nTEL: 03293828343") ;
		System.out.println("Date: " + dateTime) ;
		System.out.printf("Cashier: %s \nCustomer Name: %s \n", cashierName, customerName) ;
		System.out.println("========================================================") ;
		System.out.printf("%20s%10s%10s%15s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)") ;
		System.out.println("--------------------------------------------------------") ;
		
		for (int item = 0; item <= index; item++) {
			System.out.printf("%20s%10d%10.2f%15.2f%n", itemsBought[item], piecesBought[item], pricePerUnit[item], totalPerUnit[item]) ;
		}

		System.out.println("\n--------------------------------------------------------") ;

		System.out.printf("%45s%10.2f%n%45s%10.2f%n%45s%10.2f%n", "Sub Total: ", subTotal, "Discount:", discountPrice, "VAT @ 7.50%:",vAT) ;
		System.out.println("========================================================") ;
		System.out.printf("%45s%10.2f%n%45s%10.2f%120s%10.2f%n", "Bill Total:", total, "Amount Paid:", amountPaid, "Balance:", balance) ;
		System.out.println("========================================================") ;
		System.out.printf("                THANK YOU FOR YOUR PATRONAGE") ;
		System.out.print("\n========================================================") ;
		

	}

}
