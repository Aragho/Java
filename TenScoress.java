import java.util.Scanner;

public class TenScoress{

public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter 10 scores: ");
int score10 = input.nextInt();


int score = 0;
int counter;


		for(counter = 0; counter<= 10; counter++){

		System.out.print("Enter 10 scores: ");
		score = input.nextInt();

		if(counter == 5){
		break;
      		}
		   
		
		System.out.println("the value of counter is " + counter);

		}
	     }
	}