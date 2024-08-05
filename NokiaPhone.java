import java.util.Scanner;

public class NokiaMenu{

public static void main(String[] args){
Scanner input = new Scanner(System.in);


System.out.print("Welcome to your Nokia phone: ");

System.out.print("Your Nokia menu map: ");

System.out.print("List of menu functions: ");

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

	switch(number1){
   case 1 :System.out.print(""" 
	PHONE BOOK
	Enter
	1.=>Search
	2.=>Search Nos.
	3.=>Add name
	4.=>Erase
	5.=>Edit
	6.=>Assign tone
	7.=>Send b'card
	8.=>options
	9.=>Speeds dials
	10.=>Voices tags
	11.=>Exit\n\nEnter:
	""");
	break;
	
	case 2:System.out.print(""" 
	 MESSAGES
	 Enter
	1.=>Write messages
	2.=>Inbox
	3.=>Outbox
	4.=>Pictures messages
	5.=>Templates
	6.=>Smileys
	7.=>Messages
	8.=>Info service 
	9.=>Voice mailbox number
	10.=>Service command editor
	11.=>Exit\n\nEnter:
	""");
	break;

	case 3:System.out.print("""
	   CHATS
	   break;


	case 4:System.out.print("""
	    CALL REGISTER
	    Enter
	1.=>Missed calls
	2.=>Received calls
	3.=>Dialled numbers
	4.=>Erased recent call lists
	5.=>Show call duration
	6.=>Show call costs
	7.=>Call cost settings
	8.=>Prepaid credit
	9.=>Exit\n\nEnter:
	""");
	break;

	case 5:System.out.print("""
	    TONES
	1.=>Ringing tone
	2.=>ringing volume
	3.=>incoming call alert
	4.=>Composer
	5.=>Messages alert tone
	6.=>keypad tones
	7.=>Warning and game tones
	8.=>Vibrating alert
	9.=>Screen saver
	10.=>Exit\n\nEnter:
	""");
	break;

	case 6:System.out.print("""
		SETTINGS
	1.=>Call settings
	2.=>Phone settings
	3.=>Security settings
	4.=>Restore factory settings
	5.=>Exit\n\nEnter:
	""");
	break;

	case 7:System.out.print("""
		CALL DIVERT

	case 8:System.out.print("""
		GAMES
		breaks;

	case 9:System.out.print("""
		CALCULATOR
		break;

	case 10:System.out.print("""
		REMINDERS
		breaks;

	case 11:System.out.print("""
		CLOCK
	1.=>Alarm clock
	2.=>Clock settings
	3.=>Date setting
	4.=>Stopwatch
	5.=>Countdown timer
	6.=>Auto update of date and time
	7.=>Exit\n\nEnter:
	""");
	break;
	

	case 12:System.out.print(""'
	Exit\n\nEnter:
	""");
	break;


	case 13:System.out.print("''
	Exit\n\nEnter:
	""");
	break;

	}
   }
}			

	
		

	