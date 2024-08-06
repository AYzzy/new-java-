import java.util.Scanner;
import java.util.Arrays;

public class Akash{

	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

		int[] numbers =  new int[10];

		for(int index =0;index <10;index++){

			System.out.println("Enter a number: ");
			numbers[index] = input.nextInt();
	
		}

		System.out.print(Arrays.toString(numbers));
	}




}