import java.util.Scanner;

public class WhileLoopExample{

	public static void main(String[] nike){

		Scanner adenike = new Scanner(System.in);
		int countOfNegative = 0;
		int countOfPositive = 0;
		int countOfZero = 0;
		int sumOfPositive = 0;

		System.out.print("Enter a number  or -1 to quit: ");
		int userInput = adenike.nextInt();

		while(userInput != -1){

			if(userInput > 0){
				countOfPositive++;
				sumOfPositive += userInput;
			} else 
			if(userInput < 0){
				countOfNegative++;
			} else
			if(userInput == 0){
				countOfZero++;
			}
			
			System.out.print("Enter a number  or -1 to quit: ");
			userInput = adenike.nextInt();
		}
		
		System.out.println("Count of Positive is " + countOfPositive);
		System.out.println("Count of Negative is " + countOfNegative);
		System.out.println("Count of Zero is " + countOfZero);
		System.out.println("Sum of Positive is " + sumOfPositive);

	}


}