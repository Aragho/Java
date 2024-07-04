import java.util.Scanner;

public class Division{

  	public static void main(String[] args) {
	    
		Scanner input = new Scanner(System.in);

		System.out.println("Enter two number: ");
		int firstNumber = input.nextInt();
		int secondNumber = input.nextInt();
       	
		 
		float division = Kata.division(firstNumber , secondNumber);
		System.out.printf("number is %.2f", division);        
       	}	
 }



