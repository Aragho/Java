import java.util.Scanner;
 
  public class AreaOfCircle {

   public static void main(String[] args ) {
   Scanner input = new Scanner(System.in);
  
   System.out.print(" Enter the radius of a circle: ");
   int radius = input.nextInt();

   
   double constant = 3.14159;
   double diameter = (2 * constant);
   double circumference  = (2 *  constant * radius);
   double figure1 = (radius * radius);
   double area = (constant * figure1);

   System.out.printf(" the diameter of a circle is %.2f%n ",diameter);
   System.out.printf(" the circumference of a circle is %.2f%n ",circumference);
   System.out.printf(" the area of a circle is %.2f%n ",area);
   }
}



