import java.util.Scanner;

  public class Financial {
   
  public static void main(String[]args ) {
  Scanner input = new Scanner(System.in);

  System.out.print(" Enter the balance: ");
  double balance = input.nextDouble();

  System.out.print(" Enter the annualInterestrate: ");
  double annualInterestRate = input.nextDouble(); 

  double constant = 1200;

  double interestRate = annualInterestRate / constant;
  
  double interest = balance * interestRate;

  System.out.println("the interest is" + interest);

  }

 }
