 import java.util.Scanner;
   
   public class Lottery {

    public static void main(String[] args ) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first award: ");
    int award1 = input.nextInt();

    System.out.print("Enter the second award: ");
    int award2 = input.nextInt();

    System.out.print("Enter the third award: ");
    int award3 = input.nextInt();

    System.out.print("Enter the fourth award: ");
    int award4 = input.nextInt();

    double award5 = (award1 * award4);
    System.out.printf("Multiplication is %.2f", award5);

    double award6 = (award2 * award4);
    System.out.printf("Multiplication is %.2f", award6);

    double award7 = (award3 * award4);
    System.out.printf("Multiplication is %.2f", award7);
   }
 }

