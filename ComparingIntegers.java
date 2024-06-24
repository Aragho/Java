import java.util.Scanner;
 
  public class ComparingIntegers {

   public static void main(String[] args ) {
   Scanner input = new Scanner(System.in);

   System.out.print(" Enter first integer: ");
   int number1 = input.nextInt();

   int square = number1 * number1;

    if(square > 100) {
    System.out.println(square +  "is => 100");
    }
    else {
    System.out.println(square + "is < 100");
    }
    if(square == 100){
    System.out.println(square + "is == 100");   
    }
    else {
    System.out.println(square + "is != 100");
    }
   }
  } 

   

