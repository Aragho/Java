import java.util.Scanner;

public class NokiaMute{

public static void main(String[] args){
Scanner input = new Scanner(System.in);


System.out.println("Welcome to your Nokia phone: ");

System.out.println("Your Nokia menu map: ");

System.out.println("List of menu functions: ");

System.out.println("""
1.Phonebook 
2. Message
3. Chat
4.Call register 
5. Tones 
6. Settings 
7. Call divert
8.Games
9. Calculators 
10. Reminders 
11. clock 
12. Profiles 
13. SIM services

Enter
""");

System.out.print("Enter a number1: ");
int number = input.nextInt();

	switch(number){
case 4:System.out.print("""
	    CALL REGISTER
 	 1.=>Missed calls
2.=>Received calls
 	3.=>Dialled numbers
	4.=>Erased recent call lists
	5.=>Show call duration
	6.=>Show call costs
	7.=>Call cost settings
	8.=>Prepaid credit
	9.=>Exit
	Enter:
	""");
			int number2 = input.nextInt();
	switch(number2){
		case 5:
			System.out.print("""
                      1.Last call cost 
                      2.All call's duration
		      3.Receievd call's duration
		      4.Dialled calls's duration
		      5.Clear timers
			""");
							int number3 = input.nextInt();
	 						switch(number3){
							case 6:
							System.out.print("""
                     					 1.Show call costs 
                     					 2.All call's cost
							 3.Clear counters
								""");
							}
												int number4 = input.nextInt();
												switch(number4){
												case 7:
												System.out.print("""
                     										1.Call cost limit 
                      										2.Show costs in
												""");
												}


	}

	break;
     }
  }
}
