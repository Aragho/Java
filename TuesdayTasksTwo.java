import java.util.Scanner; 

public class TuesdayTasksTwo {

public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("Enter a number: ");
int userInput = input.nextInt();
			


	int factor = 0;
	int number = 0;
				
			for(int index = 2; index <= userInput; index++){
			

			if(userInput % index == 0){
				number++;
	
 			}
                  }
        
			System.out.println("factor is " + number);

	}
  }



   
