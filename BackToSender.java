import java.util.Scanner;

public class BackToSender{

	public static int calculateRidersPayment(int numberOfDelivery){
		
		if(numberOfDelivery > 0 && numberOfDelivery < 50 ){
		return numberOfDelivery * 160 + 5000;
		}

		else
		if(numberOfDelivery >= 50 && numberOfDelivery <= 59){
		return numberOfDelivery * 200 + 5000;
		}

		else
		if(numberOfDelivery >= 60 && numberOfDelivery <=69){
		return numberOfDelivery * 250 + 5000;
		}

		else
		if(numberOfDelivery >= 70){
		return numberOfDelivery * 500 + 5000;
					
		}
		return 0;
	
	}

	public static void main(String[] args) {
	    
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int userInput = input.nextInt();
	
		int BackToSender = calculateRidersPayment(userInput);
		System.out.println("BackToSender is " + BackToSender );

	}				 


}

