import java.util.Scanner;

  public class CalculatingEnergy {
   
  public static void main(String[]args ) {
  Scanner input = new Scanner(System.in);

   System.out.print(" Enter the amount of water in kilogram: ");
   double kilogram = input.nextDouble();

  System.out.print(" Enter the final temperature: ");
  double temperature1 = input.nextDouble();

  System.out.print(" Enter the initial temperature: ");
  double temperature2 = input.nextDouble(); 

  double constant = 4184;

  double temperature = temperature1 - temperature2; 

  double weight = temperature * constant;

  double energy = weight * kilogram;

  System.out.print("the energy is " + energy);
  }
}

 

  


 
 
