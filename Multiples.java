import java.util.Scanner;
 
  public class Multiples {

   public static void main(String[] args ) {
   Scanner input = new Scanner(System.in);

   System.out.print(" Enter first integer: ");
   int firstNumber = input.nextInt();

   System.out.print(" Enter second integar: ");
   int secondNumber = input.nextInt();

  int tripled = firstNumber * 3;
  int doubled = secondNumber * 2;
  int reminder = tripled % doubled;

 if ( reminder == 0){
     System.out.printf(" \n it is a multiple of squared second integer ");
    }
     else{
       System.out.printf(" it is not a multiple of squared second integer ");
    }
   }
  }

  
