import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayAssignmentTest{

	@Test
	public void testToGetLargestNumber(){

	ArrayFunction number = new ArrayFunction();

	int [] digits = {1,2,3,4,5,6};
	int result = number.getLargestNumber(digits);

	assertEquals(6, result);

	}

	@Test
	public void testToGetEvenNumbers(){

	ArrayFunction number = new ArrayFunction();

	int [] values = {2,3,4,5,6,7,8,9,10};
	int [] evenResult = {2,4,6,8,10};

	int[] result = number.getEvenNumber(values);

	assertEquals(evenResult, result);

	}


}