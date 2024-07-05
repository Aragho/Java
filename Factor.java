import java.util.Scanner;

public class Factor{

  	public static void main(String[] args) {
	    
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int userInput = input.nextInt();
				 
		int factor = Kata.factor(userInput); 
		System.out.println("factor is " + factor);

     
       	}	
 }



