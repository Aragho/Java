import java.util.Scanner;

	public class LetterGrade{

	public static void main(String[] args ){
	Scanner input = new Scanner(System.in);

System.out.print(" Enter a grade number: ");
int userInput = input.nextInt();


	if (userInput >= 80) {
		System.out.println(" your score grade is A");
	}
	
	if (userInput >= 70 && userInput <= 80){
		System.out.println(" your score grade isc B");
	}

	if (userInput >= 50 && userInput <= 60 ){
		System.out.println(" your score grade is C");
	}

	if (userInput >= 40 && userInput <= 50){
		System.out.println("your score grade is  D");
	}
 }
}

 