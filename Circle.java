 import java.util.Scanner;

 public class Circle {
   
   public static void main(String[]args ) {
   Scanner input = new Scanner(Sytem.in);

   double radius = 6.5;

   double height = 3.14159;

   double perimeter = 2 * radius * height;
   System.out.printf("Multiplication %.2f", perimeter);

   double area = radius * radius * height;
   System.out.printf("Multiplication %.2f", area);
   }
 }
