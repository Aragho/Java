 import java.util.Scanner; 
  
   public class Divisible3 {

   public static void main(String[] args ){

   Scanner input = new Scanner(System.in);

   System.out.print("Enter first integer:");
   int number1 = input.nextInt();

   
   int lastNumber = number1 % 3;

   if(lastNumber > 0){        
   System.out.println(number1 + "is not divisible by 3");
  }
  
  else {
  System.out.println(number1 + "is divisible by 3");
  }


}
}