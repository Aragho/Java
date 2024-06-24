 import java.util.Scanner;

  public class Pelindrome {

  public static void main(String[]args ) {
  Scanner input = new Scanner(System.in);

  System.out.print("Enter three-digit number: ");
  int number1 = input.nextInt();

  int firstNumber = number1 / 100;

  int lastNumber = number1 % 10;

 if(firstNumber == lastNumber) {
    System.out.println("is a pelindrome");
}

 else {firstNumber != lastNumber) {
  System.out.println("is not a pelindrome");
 }

 }
 }
}

  