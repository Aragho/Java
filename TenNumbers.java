import java.util.Scanner;

public class TenNumbers{

public  static void main(String[] ars ){
Scanner input = new Scanner(System.in);

int total = 0;
int counter = 1;


System.out.print("Enter a score: ");
int score = input.nextInt();

	
		while(counter <= 10){
			System.out.print("Enter score");
		int sum = input.nextInt();
	        total = total + sum;
		counter++;
   		}
          System.out.print("total is " + total);
      }
 }
