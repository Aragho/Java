import java.util.Scanner;
import java.util.ArrayList;

public class GTBank{

	public static void main(String [] args){
	Scanner input = new Scanner (System.in);

	ArrayList<String> firstNames = new ArrayList<>();

	ArrayList<String> lastNames = new ArrayList<>();

	ArrayList<Integer> pins = new ArrayList<>();

	ArrayList<Double> balances = new ArrayList<>();
	
	 boolean exit = false;
	
        while (exit) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Transfer Money");
            System.out.println("6. Change PIN");
            System.out.println("7. Close Account");
            System.out.println("8. Exit");

	int userInput = input.nextInt();


	 if (userInput == 1) {
                createAccount();
            } else if (userInput == 2) {
                depositMoney();
            } else if (userInput == 3) {
                withdrawMoney();
            } else if (userInput == 4) {
                checkBalance();
            } else if (userInput == 5) {
                transferMoney();
            } else if (userInput == 6) {
                changePin();
            } else if (userInput == 7) {
                closeAccount();
            } else if (userInput == 8) {
                exit = true;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

	System.out.println("Thank yoi fir using GTB Bank!");





		 




	}

}