import java.util.Scanner;
  
public class ZeroNumber{

public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter a number:");

int number1 = input.nextInt();

 


		if(number1 == 0)
			System.out.print("zero");
		else
			System.out.println("invalid");

 }
}