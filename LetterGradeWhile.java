import java.util.Scanner;
	
	public class LetterGradeWhile{

	public static void main(String[] args );
	Scanner input = new Scanner(System.in);

System.out.print("Enter grade number or -1 to quit: ");
int userInput = input.nextInt();

		while(userInput != -1){
			if(userInput >= 80){
		System.out.println(" your score grade is A ");
	}
	
	else

	if(userInput >= 70){
		System.out.println(" your score grade is B ");
	}

	else

	if(userInput >= 60){
		System.out.println(" your score grade is C ");
	}

	else

	if(userInput >= 50){
		System.out.println(" your score grade is D ");

	}

   }
}