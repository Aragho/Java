

public class Kata{

  
	public static boolean IsEven(int number){
		
		
        	if (number % 2 == 0) {
		
		
            		return true;

        	} 
		else {
            		return false;
        	}
   	}






 
    public static boolean IsPrimenumber(int number) {

		int numberOfFactor = 0;
                
        	for (int index = 2; index <= number; index++) {
            		if (number % index == 0) numberOfFactor++;
		
		}
		
		if (numberOfFactor == 1){
			return true;
		}
	
   		else return false;

   } 
	 public static int subtract(int number1 , int number2){

		int subtraction =  number1 - number2;

		if(subtraction < 0 ) subtraction *= -1;

		
		

		return subtraction;  


	}
	
	public static float division(int firstNumber , int secondNumber){

		if(secondNumber == 0  || firstNumber == 0) return 0;

		float numbers = (float)firstNumber / (float)secondNumber;

		

		 return numbers;

		

		
		
	}
	
	public static int factor(int userInput){

		
			int factor = 0;
					
			for(int index = 1; index <= userInput; index++){
			
			if(userInput % index == 0)
			 factor++;
			}

			if (factor == 1) {
			}
				return factor;

    	}


}  