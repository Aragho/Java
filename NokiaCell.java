import java.util.Scanner;

public class NokiaCell{

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
	case 6:System.out.print("""
		SETTINGS
	1.=>Call settings
	2.=>Phone settings
	3.=>Security settings
	4.=>Restore factory settings
	5.=>Exit
	Enter:
	""");
	              					int number3 = input.nextInt();
	 						switch(number3){
							case 1:
							System.out.print("""
                     					 1.Automatic redial 
                     					 2.Speed dialling
							 3.Call waiting options
							 4.Own number sending
							 5.Phone line in use
							 6.Automatic answer
								""");
							}
	 						int number4 = input.nextInt();
	 						switch(number4){
							case 2:
							System.out.print("""
                     					 1.Language
                     					 2.Cell info dispaly
							 3.Welcome note
							 4.Network Selection
							 5.Lights
							 6.Confirm SIM services actions
								""");
							}
							int number5 = input.nextInt();
	 						switch(number5){
							case 3:
							System.out.print("""
                     					 1.PI code request
                     					 2.Call barring service
							 3.Fixed dialling
							 4.Closed user group
							 5.Phone security
							 6.change access code
								""");
							}



	break;
     }
   }
}
