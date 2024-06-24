 import java.util.Scanner;

  public class SumDigit {

  public static void main(String[]args ) {
  Scanner input = new Scanner(System.in);

  System.out.print("Enter first number: ");
  int number1 = input.nextInt();

  System.out.print("Enter second number: ");
  int number2 = input.nextInt();

  int firstNumber = number1 / 100;

  int lastNumber = number1 % 10;

  int firstNumber1 = number2 / 100;

  int lastNumber1= number2 % 10;

  int sum = 9 + 9 + 9;

  System.out.println(" the sum is "  + sum);
  }
}
  
