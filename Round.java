import java.util.Scanner;
 
  public class Round {

   public static void main(String[] args ) {
   Scanner input = new Scanner(System.in);

   System.out.print(" Enter first integer: ");
   int figure1 = input.nextInt();

   System.out.print(" Enter second integar: ");
   int figure2 = input.nextInt();

   int firstSquare = figure1 * figure1;

   int secondSquare = figure2 * figure2;

   int sum = firstSquare + secondSquare;

   int difference = firstSquare - secondSquare;

   System.out.println(" the square of " + figure1 + " is " + firstSquare);
   
   System.out.println(" the square of " + figure2 + " is " + secondSquare);

   System.out.println(" the sum of the square is " + sum);

   System.out.println(" the difference of the square is " + difference);
   }
 }

   

   

   