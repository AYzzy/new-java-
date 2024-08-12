import java.util.Scanner;

public class CreditCardValidator{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kindly enter what you would like to validate: ");
        String number = scanner.next();
        
        String result = validateCreditCard(number);
                
	System.out.println(result);
    }
	
     public static String validateCreditCard(String number) {
        int theLength = number.length();
        int firstSum = 0;
        int secondSum = 0;
        String validity = "";
        String cardType = "";
        int[] card = new int[number.length()];

        if (theLength >= 13 && theLength <= 16) {
            for (int i = 0; i < number.length(); i++) {
                card[i] = Character.getNumericValue(number.charAt(i));
            }

            if (card[0] == 4) {
                cardType = "Visa Card";
            } else if (card[0] == 5) {
                cardType = "MasterCard";
            } else if (card[0] == 3 && card[1] == 7) {
                cardType = "American Express Card";
            } else if (card[0] == 6) {
                cardType = "Discover Card";
            }

            for (int i = 0; i < card.length; i++) {
                if (i % 2 == 0) {
                    int total = card[i] * 2;
                    if (total > 9) {
                        int brokenDown = 0;
                        while (total > 0) {
                            brokenDown += total % 10;
                            total /= 10;
                        }
                        firstSum += brokenDown;
                    } else {
                        firstSum += total;
                    }
                } else {
                    secondSum += card[i];
                }
            }
            int totalRes = firstSum + secondSum;
            if (totalRes % 10 == 0) {
                validity = "Valid";
            } else {
                validity = "Invalid";
            }
        } else {
            validity = "Invalid";
            cardType = "Invalid";
        }

        return String.format("""
                *****************************************
                **Credit Card Type: %s
                **Credit Card Number: %s
                **Credit Card Digit Length: %d
                **Credit Card Validity Status: %s
                ******************************************
                """, cardType, number, theLength, validity);
    }
}