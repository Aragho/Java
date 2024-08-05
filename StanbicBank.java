import java.util.Scanner;

public class StanbicBank{

public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter any number or -1 to quit: ");
int userInput = input.nextInt();

 


   while(userInput != -1){

        System.out.println("Welcome to E-banking");
	
        System.out.printf("press 1 to transfer\n press 2 to buy airtime\n press 3 to buy data\n press 4 to share data\n press 99 to go back\n");


	System.out.print("Press any number to get started:");
	int number = input.nextInt();


		switch(number){
			case 1: System.out.print("transfer");
				break;
			case 2: System.out.print("buy airtime");
				break;
			case 3: System.out.print("buy data");
				break;
			case 4: System.out.print("share data");
				break;
			case 99: System.out.print("go back");
				break;
			default:System.out.print("invalid code");
			
			}
            		System.out.print("Enter any number or -1 to quit: ");
                     	userInput = input.nextInt();	
                 }	
	}
   }