import java.util.Scanner;

   public class GreatPyramid {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print(" Enter the estimated number of stones used: ");
    double numberOfStones = input.nextDouble();

    System.out.print(" Enter the Average weight of each stone: ");
    double weightOfStones= input.nextDouble();

    System.out.print(" Enter the Number of years taken to build the pyramid : ");
    double yearsToBuild= input.nextDouble();

    double totalWeight = weightOfStones * numberOfStones;
    double weightPerYear = totalWeight / yearsToBuild;
    double weightPerHour = weightPerYear / (365 * 24);
    double weightPerMinute = weightPerHour / 60;

     System.out.println("total weight of the pyramid " + totalWeight);
     System.out.println("weight built per year " + weightPerYear);
     System.out.println("weight built per hour " + weightPerHour);
     System.out.println("weight built per minute "+ weightPerMinute);
     }
    }


   

    

    

       




