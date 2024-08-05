import java.util.Scanner;

public class NokiaMenu{

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
	
  
	  
		case 2:
		int userInput4 = 0;
			while(userInput4 != 11){
		System.out.print(""" 
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
		Enter
		""");
		userInput4 = input.nextInt();
		switch(userInput4){
			case 7:
			int userInput5 = 0;
			while(userInput5 != 3){
			System.out.print("""
        		1.Set 1
        		2.Common
			3.Exit
        		""");
			userInput5 = input.nextInt();
			}
			}
						switch(userInput5){
							case 1:
							int userInput6 = 0;
							while(userInput6 != 4){
							System.out.print("""
       							1.Message centre number
       							2.Memory sent as
        						3.Message validity
							4.Exit
							""");
							userInput6 = input.nextInt();
							}
							}
							break;
												case 2:
												int userInput7 = 0;
												while(userInput7 != 4){
												System.out.print("""
        											1.Delivery reports
        											2.Reply via same centre
												3.Character
												4.Exit
												""");
												userInput7 = input.nextInt();
												break;
												}
												}				
												break;
 

				case 3:System.out.print(""" 
	 			CHAT
	 			Enter:
	 			Exit:
				""");
       				 break;


	case 4:
		int userInput8 = 0;
	while(userInput8 != 9){
	System.out.print("""
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
							userInput8 = input.nextInt();
							switch(number8){

							case 5:
								int userInput9 = 0;
								while(userInput9 != 6){
								System.out.print("""
       								1.Last call cost 
        							2.All call's duration
								3.Receievd call's duration
								4.Dialled calls's duration
								5.Clear timers
								6.Exit
								""");
								}
								}
								userInput9 = input.nextInt();
								break;

												case 6:
													int userInput10 = 0;
													while(userInput10 != 4){
													System.out.print("""
        												1.Show call costs 
        												2.All call's cost
													3.Clear counters
													4.Exit
													""");
													userInput10 = input.nextInt();
													}
													break;
																case 7:
																	int userInput11 = 0;
																	while(userInput11 != 3){
																	System.out.print("""
       																	 1.Call cost limit 
        																2.Show costs in
																	3.Exit
																	""");
																	userInput11 = input.nextInt();
																	}
																	break;
																	}
																	break;
     
  

		
	 						case 5:
								int userInput12 = 0;
								while(userInput12 != 10){
								System.out.print("""
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
								10.=>Exit
								Enter:
								""");
								userInput12 = input.nextInt();
								}
								break;

	
	case 6:
	int userInput13 = 0;
	System.out.print("""
	SETTINGS
	1.=>Call settings
	2.=>Phone settings
	3.=>Security settings
	4.=>Restore factory settings
	5.=>Exit
	Enter:
	""");
 	userInput13 = input.nextInt();
							switch(number13){
								case 1:
									int userInput14 = 0;
									while(userInput14 != 6){
									System.out.print("""
        								1.Automatic redial 
        								2.Speed dialling
									3.Call waiting options
									4.Own number sending
									5.Phone line in use
									6.Automatic answer
									""");
									userInput6 = input.nextInt();
									}
									}
									break;

											case 2:
												int userInput15 = 0;
												while(userInput15 != 6){
												System.out.print("""
        											1.Language
        											2.Cell info dispaly
												3.Welcome note
												4.Network Selection
												5.Lights
												6.Confirm SIM services actions
												""");
												userInput15 = input.nextInt();
												}
												}
												break;
								
															case 3:
																int userInput16 = 0;
																while(userInput15 != 6){
																System.out.print("""
        															1.PIN code request
        															2.Call barring service
																3.Fixed dialling
																4.Closed user group
																5.Phone security
																6.change access code
																""");
																userInput15 = input.nextInt();
																}
																}
																break;
								

																break;


		
	case 7:
		int userInput16 = 0;
		while(userInput16 != 11){
		System.out.print("""
		CALL DIVERT
	Exit
	Enter:
	""");
	   
	break;

		
						case 8:System.out.print("""
						GAMES
						Exit
						Enter:
						""");
		
 						break;
		
	case 9:System.out.print("""
		CALCULATOR
	Exit
	Enter:
	""");
	   
	break;
		
						case 10:System.out.print("""
							REMINDERS
						Exit
						Enter:
						""");
         
						break;
		
	case 11:System.out.print("""
		CLOCK
	1.=>Alarm clock
	2.=>Clock settings
	3.=>Date setting
	4.=>Stopwatch
	5.=>Countdown timer
	6.=>Auto update of date and time
	7.=>Exit
	Enter:
	""");
	break;
	
		
						case 12:System.out.print("""
						Exit
						Enter:
						""");
	  
						break;


	case 13:System.out.print("""
	Exit
	Enter:
	""");
	break;
           }
         }
           		
       }
     }
   }
      
    
			

	
		

	