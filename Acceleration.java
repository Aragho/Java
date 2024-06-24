 import java.util.Scanner;

  public class Acceleration {
   
  public static void main(String[]args ) {
  Scanner input = new Scanner(System.in);

  System.out.print(" Enter the start velocity: ");
  double velocity1 = input.nextDouble();

  System.out.print(" Enter the end velocity: ");
  double velocity2 = input.nextDouble(); 


  System.out.print(" Enter the time span: ");
  double span1 = input.nextDouble(); 
 
  
 double meters = velocity1 - velocity2;

 double average = meters / span1;

 System.out.println(" the average is " + average);
 }
}

  


