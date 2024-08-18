import java.util.Scanner;
import java.util.ArrayList;
import java. util.Random;

public class GTBank{
	
	public static void main(String [] args){
	Scanner input = new Scanner (System.in);
	Random random = new Random();

	
	ArrayList<Integer> accountNumbers = new ArrayList<>();

	ArrayList<String> firstNames = new ArrayList<>();

	ArrayList<String> lastNames = new ArrayList<>();

	ArrayList<Integer> pins = new ArrayList<>();

	ArrayList<Double> balances = new ArrayList<>();

		
	 boolean exit = false;
	
        while (!exit) {
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
	switch(userInput){
		case 1: 
			System.out.println("Create an account");			

			System.out.println("Enter your first name:");
			String firstName = input.next();
			firstNames.add(firstName);

			System.out.println("Enter your last name:");
                   	String lastName = input.next();
                   	lastNames.add(lastName);
			
			int pin;
			while(true){
                    	System.out.println("Set your 4-digit PIN:");
                    	 pin = input.nextInt();
                    	if(pin >= 1000 && pin <= 9999){
				break;
			}else{
				System.out.println("Invalid PIN. please enter your 4 digit PIN");
				}
			}
			pins.add(pin);
			
			
                    	int accountNumber = random.nextInt(9000000) + 1000000;
                    	accountNumbers.add(accountNumber);
                   	balances.add(0.0);
                       	System.out.println("Account created successfully!");
			 System.out.println("Your account number is: " + accountNumber);
                    	break;

		case 2:
			System.out.println("Enter your account number:");
			accountNumber = input.nextInt();
			int index  = accountNumbers.indexOf(accountNumber);

			if (index == -1){
				System.out.println("Account number not found!");
				break;
			}
		
			System.out.println("Enter the amount to deposit:");
			double depositAmount = input.nextDouble();

			
                    if (depositAmount <= 0) {
                        System.out.println("Invalid amount. Please enter a positive number.");
                        break;
                    }

			double newBalance = balances.get(index) + depositAmount;
			balances.set(index,newBalance);

			System.out.println("Deposit successful! New Balance:" + newBalance);
			break;

			
		case 3:
			System.out.println("Enter your account number:");
			 accountNumber = input.nextInt();
			 index  = accountNumbers.indexOf(accountNumber);

			if (index == -1){
				System.out.println("Account number not found!");
				break;
			}
			
			System.out.println("Enter your pin:");
			int enteredPin = input.nextInt();
			if(pins.get(index) != enteredPin){
				System.out.println("Incorrect PIN!:");
				break;
			}
			
                    	System.out.println("Enter the amount to withdraw:");
                    	double withdrawAmount = input.nextDouble();
	
			double currentBalance = balances.get(index);

                    if (currentBalance  >= withdrawAmount) {
                         newBalance = currentBalance - withdrawAmount;
                        balances.set(index, newBalance);
                        System.out.println("Withdrawal successful! New balance: " + newBalance);
		     }else if (withdrawAmount <= 0) {
			System.out.println("Invalid amount. please enter a valid number>");

                    } else {
                        System.out.println("Insufficient balance!");
                   	 
		    }
                    break;

		case 4:
    			System.out.println("Enter your account number:");
   			accountNumber = input.nextInt();
    			index = accountNumbers.indexOf(accountNumber);

    			if (index == -1) {
       			 System.out.println("Account number not found!");
        		break;
   			 }

			System.out.println("Enter your pin:");
			enteredPin = input.nextInt();
			if(pins.get(index) != enteredPin){
				System.out.println("Incorrect PIN!:");
				break;
			}
			


   			 currentBalance = balances.get(index);
   			 System.out.println("Your balance is: " + currentBalance);
   			 break;


		case 5:
			
    			System.out.println("Enter your account number:");
   			accountNumber = input.nextInt();
    			index = accountNumbers.indexOf(accountNumber);

    			if (index == -1) {
       			 System.out.println("Account number not found!");
        		break;
   			 }

			System.out.println("Enter your pin:");
			enteredPin = input.nextInt();
			if(pins.get(index) != enteredPin){
				System.out.println("Incorrect PIN!:");
				break;
			}

			System.out.println("Enter the  receiver's account number:");
			int receiverAccountNumber = input.nextInt();
			int receiverIndex = accountNumbers.indexOf(receiverAccountNumber);

			if(receiverIndex == -1){
				System.out.println("Receiever account not found!");
				break;
			}

			System.out.println("Enter the amount to transfer:");
			double transferAmount = input.nextDouble();

			double senderBalance = balances.get(index);
			if (senderBalance >= transferAmount && transferAmount > 0){
			double newSenderBalance = senderBalance - transferAmount;
			balances.set(index, newSenderBalance);

			double receiverBalance = balances.get(receiverIndex);
                        double newReceiverBalance = receiverBalance + transferAmount;
                        balances.set(receiverIndex, newReceiverBalance);

                        System.out.println("Transfer successful! New balance: " + newSenderBalance);
                    } else if (transferAmount <= 0) {
                        System.out.println("Invalid amount. Please enter a positive amount.");
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;


			

		case 6:

			System.out.println("Enter your account number:");
   			accountNumber = input.nextInt();
    			index = accountNumbers.indexOf(accountNumber);

    			if (index == -1) {
       			 System.out.println("Account number not found!");
        		break;
   			 }
			
			System.out.println("Enter your old PIN:");
			int oldPin = input.nextInt();
			
			if(pins.get(index) != oldPin){
				System.out.println("Incorrect old PIN");
			break;
			}
			
			System.out.println("Enter your new PIN:");
    			int newPin = input.nextInt();

    			while (newPin < 1000 || newPin > 9999) {
       		 	System.out.println("Invalid PIN. Please enter a 4-digit PIN:");
        		newPin = input.nextInt();
   			 }

   			 pins.set(index, newPin);
   			 System.out.println("PIN changed successfully!");
   			 break;

		case 7:
    			System.out.println("Enter your account number:");
    			accountNumber = input.nextInt();
    			index = accountNumbers.indexOf(accountNumber);

    			if (index == -1) {
        		System.out.println("Account number not found!");
        		break;
    			}

			System.out.println("Enter your pin:");
			enteredPin = input.nextInt();
			if(pins.get(index) != enteredPin){
				System.out.println("Incorrect PIN!:");
				break;
			}


       			firstNames.remove(index);
    			lastNames.remove(index);
   			 pins.remove(index);
    			balances.remove(index);
    			accountNumbers.remove(index);

    			System.out.println("Account closed successfully!");
    			break;
			
		

		case 8:
			exit = true;
			break;

		default:
			System.out.println("Invalid option. please try again!!!!");
			break;
			

}




	System.out.println("Thank you for using GTB Bank!");





		 

	}


	}
   
}