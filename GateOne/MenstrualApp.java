

import java.time.Duration;
import java.time.LocalDate;
import java.util.Scanner;
public class MenstrualApp {


    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

          display();

    }

    public static void displayIntroduction() {
    }

    public static void display() {

        String functions="""
				>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        		What would you love to do
                	Enter 1 ->check  Next Period Date
                	Enter 2 ->  check Ovulation Date
                	Enter 3 -> check Fertility Period
                	Enter 4 -> check Safe Period
                	Enter 0 -> Exit Application
        		>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		""";
		System.out.println(functions);
        option();
    }

        public static void option() {
            System.out.println("Enter your option:");

            String response = scanner.next();

            if (response.equals("1")) {
                checkNextPeriod();
                System.out.print("\n");
            } else if (response.equals("2")) {
                checkOvulationPeriod();
                System.out.print("\n");
            } else if (response.equals("3")) {
                checkFertilityPeriod();
            } else if (response.equals("4")) {
                checkFertilityPeriod();
            } else if (response.equals("0")) {
                System.out.println("Thank you for trusting our app");
                System.exit();
            } else {
                System.out.println("invalid input");
                display();
            }
        }






    public static void checkNextPeriod() {
        
        System.out.println("Please  enter your Cycle length");
        int cycleLength = scanner.nextInt();
        while (cycleLength > 35){
            System.out.println("irregular flow! Go see your doctor");
            cycleLength = scanner.nextInt();
        }

        System.out.println("Enter date of your last period");
        int day = scanner.nextInt();
        while(day > 31){
            System.out.println("Enter valid date");
        }


        System.out.println("Enter month");
        int month = scanner.nextInt();
        while(month < 0 && month > 12){
            System.out.println("Enter valid month");
        }


        System.out.println("Enter year");
        int year = scanner.nextInt();



        LocalDate date = LocalDate.of(year, month, day);
        LocalDate newDate = date.plusDays(cycleLength);
        System.out.println("your next period is on " + newDate);
        System.out.println("would you like to check other thing? YES/NO");

        String ans = scanner.next();
        if (ans.equalsIgnoreCase("YES")){
            display();
        } else {
            System.out.println("Thank you for trusting our app");
        }

    }

    public static void checkSafePeriod(){
        System.out.println("Enter your shortest cycle length");
       int shortCycleLength = scanner.nextInt();
       System.out.println("Enter longest cycle length");
        int longestCycleLength = scanner.nextInt();


    }

    public static int checkOvulationPeriod() {
        System.out.println("Enter cycle length");
        int cycleLength = scanner.nextInt();
        int ovulationDate = cycleLength - 14;

        System.out.println("Enter last  period");
        int lastPeriod = scanner.nextInt();

        LocalDate localDate = LocalDate.now();
        System.out.println("The day of ovulation is " + localDate.plusDays(ovulationDate));

        System.out.println("would you love to check other thing? YES/NO");

        String ans = scanner.next();
        if (ans.equalsIgnoreCase("YES")){
            display();
        } else {
            System.out.println("Thank you for trusting our app");
        }
        return ovulationDate;
        //return cycleLength;



    }





    public  static void checkFertilityPeriod() {
        int fertileWindow = 6;
        System.out.println("Enter cycle length");
        int cycleLength = scanner.nextInt();

        int ovulationDay = checkOvulationPeriod();

        Duration lastPeriod = null;
        Duration fertileStart = lastPeriod.plusDays(ovulationDay - fertileWindow);
        Duration fertileEnd = lastPeriod.plusDays(ovulationDay + fertileWindow);


        //System.out.println("The ovulation day is: " + lastPeriod.plusDays(ovulationDay));
        System.out.println("The fertile window is from: " + fertileStart + " to: " + fertileEnd);
        System.out.println("would you love to check other thing? YES/NO");

        String ans = scanner.next();
        if (ans.equalsIgnoreCase("YES")){
            display();
        } else {
            System.out.println("Bye Bye!!!");
        }

        }

    }
