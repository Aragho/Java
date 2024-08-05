import java.util.Scanner;

public class EvenScores{

public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter 10 scores: ");
int score10 = input.nextInt();

    int score = 0;
    int sum = 0;
    int sumOfEven = 0;
    int indices = 0;
    


 for(int index = 0; index <= 10; index++){
		 sumOfEven += score;


    	System.out.print("Enter 10 scores: ");
	score = input.nextInt();
     }
     

      if(indices %2 == 0) {
     		System.out.print(indices);
        }

        
	System.out.println("the sum of  even is " + sumOfEven);
    
     
   }
}


