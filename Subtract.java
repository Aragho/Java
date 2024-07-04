import java.util.Scanner;

public class Subtract{

  	public static void main(String[] args) {
	    
		Scanner input = new Scanner(System.in);

		System.out.print("Enter two number: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
       	
		 
		int subtraction = Kata.subtract(number1 , number2);
		System.out.println("number is " + subtraction);        
       	}	
 }



