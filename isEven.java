import java.util.Scanner;

public class IsEven{

  		 public static void main(String[] args) {
	    
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		 int number = input.nextInt();
       

		boolean result = Kata.IsEven( number);
			System.out.println("number is " + result);
        }
 }