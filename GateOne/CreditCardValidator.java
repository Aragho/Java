import java.util.ArrayList;
import java.util.Scanner;

public class CreditCardValidator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> digits = new ArrayList<>();

        System.out.println("Hello, Kindly Enter the Card Details to verify:");
        String cardNumber = input.nextLine();

        for (int number = 0; number < cardNumber.length(); number++) {
            char ch = cardNumber.charAt(number);
            if (Character.isDigit(ch)) {
                int digit = ch - '0';
                digits.add(digit);
            } else {
                System.out.println("Invalid input. Only digits are allowed.");
                break;
            }
        }

        String cardType = "";
        if (cardNumber.length() < 13 || cardNumber.length() > 16) {
            cardType = "Invalid card";
        } else {
            if (digits.get(0) == 5) {
                cardType = "MasterCard";
            } else if (digits.get(0) == 4) {
                cardType = "Visa Card";
            } else if (digits.get(0) == 3 && digits.size() > 1 && digits.get(1) == 7) {
                cardType = "American Express Card";
            } else if (digits.get(0) == 6) {
                cardType = "Discover Card";
            } else {
                cardType = "Invalid card";
            }
        }

        int sumOfOdd = 0;
        int sumOfEven = 0;

        for (int index = digits.size() - 1; index >= 0; index--) {
            int digit = digits.get(index);
            if ((digits.size() - index) % 2 == 0) {
                digit = digit * 2;
                if (digit > 9) {
                    digit = (digit % 10) + (digit / 10);
                }
                sumOfEven += digit;
            } else {
                sumOfOdd += digit;
            }
        }

        int totalSum = sumOfEven + sumOfOdd;
	String validity = "";
        if (totalSum % 10 == 0) {
            validity = "Valid";
        } else {
            validity = "Invalid";
        }

        System.out.println("**Credit Card Type: " + cardType);
        System.out.println("**Credit Card Number: " + cardNumber);
        System.out.println("**Credit Card Digit Length: " + digits.size());
        System.out.println("**Credit Card Validity Status: " + validity);
    	System.out.println("*********************************************************************************************************");
	}
}