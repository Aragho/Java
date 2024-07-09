import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals; 

public class MultiplicationCalculatorTest{

	 
	@Test  //annotation
	public void testThatCalculatorCanMultiplyTwoPositiveNumbers(){
	
		//given
		MultiplicationCalculator calculator = new MultiplicationCalculator();
		//when
		int result = calculator.multiplication(5, 3);
		//assert
		assertEquals(15, result);

	


	}

}