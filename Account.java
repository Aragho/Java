import java.util.Scanner;

 public class PostiveAndNegative {

 public static void main(String[] args ) {
 Scanner input = new Scanner(System.in);

 int positiveNumber = 0;
 int negativeNumber = 0;
 int zeroNumber = 0;

 while (true) {
 System.out.print("Enter number or '-1' to quit: ");
 number = input.nextInt();
 
 if (number > 0) {
   positiveNumber ++;
  }
else if  (number < 0) {
   negativeNumber -++;
  }
else {
   zeroNumber ++;
  }
 }

 system.out.println(" positiveNumber is " + postiveNumber);
 system.out.println(" negativeNumber is " + negativeNumber);
 system.out.println(" zeroNumber is " + zeroNumber);
  }
 }


   