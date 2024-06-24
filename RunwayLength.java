import java.util.Scanner;

  public class RunwayLength {
   
  public static void main(String[]args ) {
  Scanner input = new Scanner(System.in);

   System.out.print(" Enter the speed: ");
   double speed1= input.nextDouble();

  System.out.print(" Enter the acceleration: ");
  double acceleration1 = input.nextDouble();

 double division = (speed1 * speed1) / (2 * acceleration1);

 System.out.printf("%.2f" ,division);
 }
}

 
  