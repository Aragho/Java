import java.util.Scanner;
import java.util.ArrayList;

public class CreditCardValidator{

	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	// separate the digit 
	ArrayList<Integer>digits = new ArrayList <integer> ();

	System.out.println("Hello, Kindly Enter the Card Details to verify:");
	System.out.println("Enter the Card Number digit:");
	String cardNumber = input.nextLine();
		// to separate the string, convert to int and add to array list
		for(int number = 0; number < cardNumber.length(); number++){
			//r in string char returns to numbers asic table
			int digit = cardNumber.charNumber.charAt(number) - '0';
				digits.add(digit);
			int size = cardNumber.size();	
		}
			if(cardNumber.Length() < 13 || cardNumber.length() > 16){
				length = "invalid";
			

			}
			// Determine the card type based on the first digits
			if(digits.get(0) == 5{
				cardTyoe == "MasterCard";
			}else if (digitts.get(0) == 4){
				cardType == "Visa Card";
			}else if (digits.get(0) == 3 && gigits.get(1) == 7){
				cardType == "American Express Card";
			}else if (diits.get(0) == 6){
			} else {
				cardType = "Invlaid card";
		}


}


























