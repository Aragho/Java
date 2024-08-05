import java.util.Scanner;

public class Nokia{

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
	11.=>Exit

	Enter:
	""");
	int number2 = input.nextInt();
	switch(number2){
		case 8:
			System.out.print("""
                      1.type of view  
                      2. memory status
			""");
	}
	break;
	}
   }
}