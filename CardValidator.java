import java.util.ArrayList;
import java.util.List;
public class CardValidator{

	public static void main(String[] args) {
		int add =0;
		int myNumber = 1230456;
    		List<Integer> digits = separateDigits(myNumber);
    		for(int i =0; i < digits;i++){
			digits *= digits;
			System.out.println(add);
		}
	}

	public static List<Integer> separateDigits(int number) {
    	List<Integer> digitList = new ArrayList<>();
    	while (number > 0) {
        	digitList.add(number % 10);
        	number /= 10;
    	}
    	return digitList;
	}



	


}