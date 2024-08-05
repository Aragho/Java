import java.util.Scanner;

public class Selections{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print(" Enter the grades: " );
	int grade = input.nextInt(); 
 	 

		switch (grade){
			case 100: 
			case 90:
       			     System.out.println(" your score grade is A ");
			     break; 
			case 80:
			     System.out.println(" your score grade is B ");
			     break; 
			case 70: 
			      System.out.println(" your score grade is C ");
			     break;			
			case 60: 
			       System.out.println(" your score grade is D ");
			     break;
			case 50:
			      System.out.println(" your score grade is E ");
			     break;
			 }
  
    }
}


