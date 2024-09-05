import java.util.Scanner;
import java.util.Arrays;
public class StudentGradeApp{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter total number of student: ");
int students = scanner.nextInt();
 
System.out.print("Enter total number of subject: ");
int subjects = scanner.nextInt();


 
int [][] student = new int [students][subjects];
int [] total = new int [students];
int [] newTotal =  new int [students];
double [] average = new double [students];
int [] position = new int [students];

for(int index = 0, counter = 1; index < students; index++, counter++){
	int sum = 0; 
	for (int element = 0, count =  1; element < subjects; element++, count++){
		System.out.print("Entering score of the student "+counter+" \nEnter score for subject " + count+": ");
		student[index][element] = scanner.nextInt();
		System.out.println("Saving >>>>>>>>>>>>>>>>");
		System.out.print("Successfully");
		System.out.println();
		
		sum += student[index][element];
		
		System.out.println();

	}
		total[index] = sum;
		newTotal[index] = sum;
		average[index] = sum / subjects;
		
}



		Arrays.sort(newTotal);

		for(int index = 0, count = 1; index < student.length; index++, count++){

			for(int element = 0; element < student.length; element++){
			if(total[index] == newTotal[element]){
				position[index] = student.length - element;
					}
				
				}

					} 


		System.out.print("STUDENT  ");
		
		for(int index = 1; index <= subjects; index++){
			System.out.printf("%10s", "SUB" +index);

		}

		System.out.printf("%10s%10s%10s%n", "TOTAL ", "AVERAGE ", "POSITION");
	
		for(int index = 0, count = 1; index < students; index++, count++){
				System.out.print("Student "+ count);
				
			for(int element = 0; element < subjects; element++){
				System.out.printf("%10d", student[index][element]);
			}
			System.out.printf("%8d%9.2f%10d", total[index], average[index],position[index]);
			System.out.println();

		}

	

	}


}