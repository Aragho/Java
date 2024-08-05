import java.util.Scanner;

public class Nokiaa{

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

case 2:System.out.print(""" 
	 MESSAGES
	 Enter:
	1.=>Write messages
	2.=>Inbox
	3.=>Outbox
	4.=>Pictures messages
	5.=>Templates
	6.=>Smileys
	7.=>Messages settings
	8.=>Info service 
	9.=>Voice mailbox number
	10.=>Service command editor
	11.=>Exit
	Enter:
	""");
		int number2 = input.nextInt();
	switch(number2){
		case 7:
			System.out.print("""
                      1.Set 1
            	      2.Common
                 	""");
	}
		int number3 = input.nextInt();
	switch(number3){
		case 1:
			System.out.print("""
                      1.Message centre number
                      2.Memory sent as
		      3.Message validity
			""");
	}
			
		int number4 = input.nextInt();
	switch(number4){
		case 2:
			System.out.print("""
                      1.Delivery reports
                      2.Reply via same centre
		      3.Character
			""");
	}
					
		
					
	break;
     }
  }
}

		