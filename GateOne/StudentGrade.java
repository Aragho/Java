import java.util.Scanner;
import java.util.Arrays;
public class StudentGrade{

	public static void main (String... args){
	Scanner input = new Scanner(System.in);

	System.out.print("How Many  Student do you have:");
	int numberOfStudent = input.nextInt();

	System.out.print ("How many Subject do you offer:");
	int numberOfSubject = input.nextInt(); 

	int [] [] totalStudent = new int [numberOfStudent] [numberOfSubject];
	double [] totalScoreForStudentSubject = new double [numberOfStudent];
	double [] aveargeTotalScoreForStudent = new double  [numberOfStudent];
	double [] toGetPosition = new double [numberOfStudent];
	int []  studentScorePosition = new int [numberOfStudent];

	for(int count = 0, index = 1; count < numberOfStudent; count++, index++){
		System.out.println();
		System.out.println("Entering score of student " +  index);
		double sum = 0;

		for(int subjectCounter = 0, counter = 1; subjectCounter < numberOfSubject; subjectCounter++, counter++){
			System.out.printf("Entering score of subject %d: ", counter);
			totalStudent [count] [subjectCounter] = input.nextInt(); 
			sum += totalStudent [count] [subjectCounter];
			}
			totalScoreForStudentSubject [count] = sum;
			toGetPosition [count] = sum;
			aveargeTotalScoreForStudent [count] = sum/numberOfSubject;
					}

		System.out.print("STUDENT");

	for(int index = 1; index <= numberOfSubject; index++){
		System.out.printf("\t SUB %d", index);
	

	}
		System.out.print("\t TOT \t AVE \t POS"); 
		System.out.println();
		Arrays.sort(toGetPosition);

		for(int index = 0; index < totalStudent.length; index++){
			for(int count = 0; count < totalStudent.length; count++){
				if(totalScoreForStudentSubject [index] == toGetPosition [count])
					studentScorePosition [index] = totalStudent.length - count;
				
			}
		}
		
		for(int number = 0, count = 1; number < numberOfStudent; number++, count++){
			System.out.printf("Student%d", count);
			for(int counter = 0; counter < numberOfSubject; counter++){
			System.out.printf("%6d", totalStudent[number][counter]);
			}
			System.out.printf("%7.0f", totalScoreForStudentSubject[number]);
			System.out.printf("%9.2f", aveargeTotalScoreForStudent[number]);
			System.out.printf("%7d", studentScorePosition[number]);
			
			System.out.println();	
			}
			
	}

	
}

