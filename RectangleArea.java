  import java.util.Scanner;

  public class RectangleArea {

  public static void main(String[]args ) {
  Scanner input = new Scanner(System.in);

  System.out.print("Enter first value: ");
  double value1 = input.nextDouble();

  System.out.print("Enter second value: ");
  double value2 = input.nextDouble();

  double area = value1 * value2;
  System.out.printf("Area %.2f ", area);

  double perimter = 2 * (value1 + value2);
  
  System.out.printf("%.2f ",  perimter);
 }
}