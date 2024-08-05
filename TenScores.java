import java.util.Scanner;

public class TenScores{

public static void main(String[] args ){
Scanner input = new Scanner(System.in);

int userInput = 0;
int total = 0;

		for(int index = 1; index <= 10; index++){
			System.out.print("Enter a number to enter or -1 to quit: ");
		        userInput = input.nextInt();
				
 			total = total + userInput;
		}				
		
		

		System.out.println("Total score is " +  total);

			     
	}
    }
