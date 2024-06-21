import java.util.Scanner;

public class Numbers{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		                
       		System.out.print("Enter a number  or 100 to quit: ");
		int userInput = input.nextInt();

		int largestNumber = 0;
                int smallestNumber = userInput;
                

         	while(userInput != 100){
       			if(userInput > largestNumber){
				largestNumber = userInput;
				
			} 
			if(userInput < smallestNumber){
				 smallestNumber = userInput;
			}
    
       			System.out.print("Enter a number  or 100 to quit: ");
			 userInput = input.nextInt();
		}

      System.out.println(" largestNumber is " + largestNumber);
      System.out.println(" smallestNumber is " + smallestNumber);
       
}
      

      

      




}