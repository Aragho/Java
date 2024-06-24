import java.util.Scanner;

 public class PositiveAndNegative {

 public static void main(String[] args ) {
 Scanner input = new Scanner(System.in);

 int positiveNumber = 0;
 int negativeNumber = 0;
 int zeroNumber = 0;

 while (true) {
 System.out.print("Enter number of integer (-1 to quit): ");
 int noOfCount = input.nextInt();

 for (int i = 0; i < noOfCount; i++) {
 System.out.print("Integers " + (i +1) + " : ");
 int number = input.nextInt();

 
 if (number > 0) {
   positiveNumber ++;
  }
else if  (number < 0) {
   negativeNumber ++;
  }
else {
   zeroNumber ++;
  }
 }
}
 System.out.println("Number of negative inputs: " + positiveNumber);
 System.out.println("Number of negative inputs: " + negativeNumber);
 System.out.println("Number of negative inputs: " + zeroNumber);
   }
 }


   