import java.util.Scanner;

public class AndOperator{

public static void main(String[] args){
Scanner input = new Scanner(System.in);


System.out.println("Enter a number is divisble by 5 and 3;");
int number1 = input.nextInt();
int number2 = input.nextInt();


	int firstNumber = number1 % 5;
	int lastNumber = number2 % 3;
	



   	if (firstNumber >= 0 && lastNumber <= 0){
		System.out.println(firstNumber + "is  by divisible by 5");
	}
	
	else{
		System.out.println(lastNumber +  "is  not divisble by 3");
	}
     }
   }
