import java.util.Scanner;
import java.util.Arrays;

public class StudentGradeApp3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int student = 0;
        int subject = 0;

        while (student <= 0) {
            System.out.print("Enter total number of students: ");
            student = input.nextInt();
            if (student <= 0) {
                System.out.println("Enter a positive number.");
            }
        }

        while (subject <= 0) {
            System.out.print("Enter total number of subjects: ");
            subject = input.nextInt();
            if (subject <= 0) {
                System.out.println("Enter a positive number.");
            }
        }

        int[][] students = new int[student][subject];
        int[] totalScores = new int[student];
        double[] averageScores = new double[student];
	int [] positions = new int[student];


		for (int count = 0; count < student; count++) {
			int total = 0 ;
			
			for (int score = 0; score < subject; score++) {
				System.out.println("Entering the score for student " + (count + 1)) ;
				System.out.println("Entering score for subject " + (score + 1)) ;
				int result = input.nextInt() ;
				
				students[count][score] = result ;
				total += result;
				System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\nSaved Successfully\n\n") ;
			}
		totalScores[count] = total;
		averageScores[count] = (double) total / subject;
		}

		System.out.println("==============================================================");
		System.out.printf("STUDENT\t\t");
		for (int count = 1; count <= subject; count ++) {
			System.out.printf("SUB%d\t", count);
		}
		System.out.printf("TOT\tAVE\tPOS\n");
		System.out.println("==============================================================");
		for (int index = 0; index < student; index++) {
			positions[index] = 1;
            
			for (int position = 0; position < student; position++) {
				if (totalScores[position] > totalScores[index]) {
                    			positions[index]++;
				}
			}
		}

		for (int counter = 0; counter < student; counter++) {
			System.out.printf("Student %d\t", (counter + 1));

			for (int score = 0; score <= subject - 1; score++) {
				System.out.printf("%d\t", students[counter][score]);
			}
		System.out.printf("%d\t%.2f\t%d\n", totalScores[counter], averageScores[counter], positions[counter]);
 	       }
		System.out.println("==============================================================");
		System.out.println("==============================================================");
	}


       
}