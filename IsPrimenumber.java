import java.util.Scanner;

public class IsPrimenumber{

  		 public static void main(String[] args) {
	    
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		 int number = input.nextInt();
       

		boolean result = Kata.IsPrimenumber( number);
	if (result == true) {
            System.out.println(number + " is a prime number.");
        } 
	else if ( result == false ){
            System.out.println(number + " is not a prime number.");
        }

        }
 }



