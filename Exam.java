 import java.util.Scanner;

    public class Exam {

      public static void main(String[] args ) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter first value: ");
      int vaule1 = input.nextInt();

      System.out.print("Enter second value: ");
      int value2 = input.nextInt();

      System.out.print("Enter third value: ");
      int value3 = input.nextInt();
      
      int value4 = (value1 - value2);
      System.out.printf("Subtraction is %d\n", value4);
 
      int value5 = (value1 - value3);
      System.out.printf("Subtraction is %d\n", value5);

      int Subtraction = value4 - value5;
      System.out.printf("Subtraction is %d\n", subtraction);
      }
 }
     

  