import java.util.Scanner;

public class Phonebook{

public static void main(String[] args){
Scanner input = new Scanner(System.in);


System.out.println("Welcome to your Nokia phone: ");

System.out.println("Your Nokia menu map: ");

System.out.println("List of menu functions: ");
int userInput = 0;
while(userInput != 14){
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
14.Exit	
Enter
""");
userInput =input.nextInt();
		

	switch(userInput){
   case 1 :
	int userInput2 = 0;
	while(userInput2 != 11){
	System.out.print(""" 
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
					userInput2= input.nextInt();
					switch(userInput2){
					case 8:
					int userInput3 = 0;
					while(userInput3 != 3){

					System.out.print("""
        				1.type of view  
        				2 memory status
					3.Exit
					""");
					userInput3 = input.nextInt();
					}
					}
					break;
					}
			}
		}
           }
	}
  
