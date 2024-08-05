import java.util.Scanner;

public class TasksFour{

public static void main(String[] args){
Scanner input = new Scanner(System.in);

    int score = 0;
    int sumOfEvenScore = 0;
    int indexes;
    

 for(indexes = 1; indexes <= 10; indexes++){
		 
    	System.out.println("Enter a score: ");
	score = input.nextInt();
     
     
      if(indexes % 2 == 0) 
     		sumOfEvenScore = sumOfEvenScore + score;
         
      	}
        
	System.out.println("the sum of even score is " + sumOfEvenScore);
    
     
   }
}

