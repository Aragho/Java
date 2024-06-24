import java.util.Scanner;

   public class WorldPopulation {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print(" Enter the population after one year: ");
    long population1 = input.nextLong();

    System.out.print(" Enter the population after two year: ");
    long population2 = input.nextLong();

    System.out.print(" Enter the population after three year: ");
    long population3 = input.nextLong();

    System.out.print(" Enter the population after four year: ");
    long population4 = input.nextLong();

    System.out.print(" Enter the population after five year: ");
    long population5 = input.nextLong();

    System.out.print(" Enter the currentPopulation: ");
    long currentPopulation = input.nextLong();

    System.out.print(" Enter the pastPopulation: ");
    long pastPopulation = input.nextLong();

    long subtraction = currentPopulation - pastPopulation;
    long division  = subtraction - pastPopulation;
    long estimatedWorldPopulation = division * 100;

    System.out.println(" the estimatedWorldPopulation is  " + estimatedWorldPopulation);
    }
   }
    
    

    

    
    





    


   





