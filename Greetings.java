import java.util.Scanner;

public class Greetings{

public static void main(String[] args ){
Scanner input = new Scanner(System.in);

System.out.print("Enter 1 to be greeted in english or 0 to be greeted in hausa:");
int number = input.nextInt();



		System.out.print(number == 1? "english" : "hausa");
			
		
	}
   }

