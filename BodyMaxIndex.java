 import java.util.Scanner;

   public class BodyMaxIndex {

   public static void main(String[] args ) {

   Scanner input = new Scanner(System.in);

   System.out.print(" Enter the weightInIndex: ");
   int weight = input.nextInt();

   System.out.print(" Enter the heightInInches: ");
   int height = input.nextInt();
  
   int bmi = (weight * 703) / (height * height);

   System.out.println(" the bmi is " + bmi);
  }
}



  
  

