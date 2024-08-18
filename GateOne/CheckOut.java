import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CheckOut{

	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	ArrayList<String> products = new ArrayList<>();

	ArrayList<Integer> quantities = new ArrayList<>();

	ArrayList<Double> prices = new ArrayList<>();
	
	ArrayList<Double> totalForItem = new ArrayList<>();

	System.out.println("Whats the customer's name?");
	String customerName = input.nextLine();
	boolean addingItems = true;

	while (addingItems){
		System.out.println("What did the user buy?");
		String product = input.nextLine();
		products.add(product);
	
	System.out.println("How many Pieces?");
	int quantity= input.nextInt();
	quantities.add(quantity);

	System.out.println("How much per unit?:");
	double price = input.nextDouble();
	prices.add(price);

	 double itemTotal = quantity * price;
	totalForItem.add(itemTotal);
	input.nextLine();
		
		System.out.println("Add more item? (YES/NO)");
	String item = input.nextLine().toUpperCase();

		if(item.equals("NO")){
			addingItems = false;
		  } else if (!item.equals("YES")) {
                System.out.println(" Please enter YES or NO.");
		}
						
	}
	System.out.println("Whats the cashier's name?");
		String cashierName = input.nextLine();
	
	System.out.println("How much discount will you get?");
		double discount = input.nextDouble();

	double total = 0;	
	for (double itemTotal : totalForItem) {
            total += itemTotal;
	}
	double VAT = 0.175 * total;
	double discountAmount = (discount / 100) * total;
	double finalTotal   = total - discountAmount + VAT;



	String storeName = " SEMICOLON STORES";
	String branchName = " MAIN BRANCH";
	String  location = "LOCATION: 312, HEBERT MACAULAY WAY, SABO YABA, LAGOS, NIGERIA.";
        String phoneNumber = "TEL: 03293828343";
	
	LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = now.format(formatter);

	System.out.println(storeName);
	System.out.println(branchName);
	System.out.println(location);
        System.out.println(phoneNumber);
	System.out.println("Date and Time: " + formattedDateTime);
	System.out.println("Cashier's name:" + cashierName);
	System.out.println("Customer's name:" + customerName);        	System.out.println("===============================================");
	
	System.out.println("ITEM\tQTY\tPRICE\tTOTAL(NGN)");
	System.out.println("-----------------------------------------------");

	
	for(int index = 0; index < prices.size(); index++){
	System.out.printf("%-10s%1d%8.2f%10.2f%n", products.get(index), quantities.get(index),prices.get(index), totalForItem.get(index));
	}
    
	System.out.println("-----------------------------------------------");
	
		

	System.out.printf("\tSubtotal: $%15.2f\n", total);
        System.out.printf("\tVAT: $%20.2f\n",	  VAT);
	System.out.printf("\tdiscount: $%15.2f\n" ,discountAmount);
	System.out.println("-------------------------------------------------------------");


	 System.out.println("============================================================	");

	System.out.printf("\tTotal: $%15.2f\n", finalTotal);

	 System.out.println("============================================================	");

	 System.out.println("THIS IS NOT A RECEIPT KINDLY PAY " + finalTotal);

	 System.out.println("============================================================	");

	System.out.println("How much did the customer give to you?");
	double amount = input.nextDouble();
	
	double changeAmount = amount - finalTotal;


	 
	System.out.println(storeName);
	System.out.println(branchName);
	System.out.println(location);
        System.out.println(phoneNumber);
	System.out.println("Date and Time: " + formattedDateTime);
	System.out.println("Cashier's name:" + cashierName);
	System.out.println("Customer's name:" + customerName);        

	System.out.println("===============================================");
	
	System.out.println("ITEM\tQTY\tPRICE\tTOTAL(NGN)");
	System.out.println("-----------------------------------------------");

	
	for(int index = 0; index < prices.size(); index++){
	System.out.printf("%-10s%1d%8.2f%10.2f%n", products.get(index), quantities.get(index),prices.get(index), totalForItem.get(index));
	}
System.out.println("-------------------------------------------------------");
	

	System.out.printf("\tSubtotal: $%15.2f\n", total);
        System.out.printf("\tVAT: $%20.2f\n",	  VAT);
	System.out.printf("\tdiscount: $%15.2f\n" ,discountAmount);
	System.out.println("-------------------------------------------------------------")
;

	 System.out.println("============================================================	");

	System.out.printf("\tTotal: $%.2f\n", finalTotal);
	System.out.printf("\tAmount paid: $%.2f\n", amount);
	System.out.printf("\tBalance: $%.2f\n", changeAmount);
	 System.out.println("============================================================	");
	System.out.println("THANK YOU FOR YOUR PATRONAGE!");
        System.out.println("===============================================");
	}
}

	





	

