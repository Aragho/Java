

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

}

                