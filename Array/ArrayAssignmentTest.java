import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayAssignmentTest{

	@Test
	public void testToGetLargestNumber(){

	LargestNumber number = new LargestNumber();

	int [] numbers = {1,2,3,4,5,6};
	int result = number.getLargestNumber(numbers);

	assertEquals(6, result);

	}


}