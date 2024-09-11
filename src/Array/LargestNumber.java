package Array;

public class LargestNumber{

	public int[] getLargestNumber(int [] numbers){

		int largest =0;
		for(int index =0; index < numbers.length ; index++){
			if(numbers[index] > index){
				largest = numbers[index];
			}
		}		
		return numbers;
	}


}