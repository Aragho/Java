 import java.util.Scanner;

   public class Arithmetic {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first integar: ");
    int number1 = input.nextInt();

    System.out.print("Enter the second integar: ");
    int number2 = input.nextInt();

    int number4 = (number1 * number1);
    System.out.printf("Multiplication is %d\n", number4);

    int number5 = (number2 * number2);
    System.out.printf("Multiplication is %d\n", number5);

    int sum = number4 + number5;
    System.out.printf("Sum is %d\n", sum);

    int subtraction = number4 - number5;
    System.out.printf("Subtraction is %d\n", subtraction);
    }
 
 } 