import java.util.Scanner;

public class MultipleSelection{

	public static void main(String[] adenike){

		Scanner femi = new Scanner(System.in);

		System.out.print("Enter a number between 1 - 5: ");
		int userInput = femi.nextInt();

		switch(userInput){
			case 1: 
				System.out.print("One");
				break;
			case 2: 
				System.out.print("Two");
				break;
			case 3: 
				System.out.print("Three");
				break;
			case 4: 
				System.out.print("Four");
				break;
			case 5: 
				System.out.print("Five");
				break;
			default:
				System.out.print("You get coconut head, Number not in between 1 to 5");
		}

	}




}