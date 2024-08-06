public class LargestNumber{

	public int[] getLargestNumber(){

		int largest =0;
		for(int index =0; index < number.length ; index++){
			if(number[index] > number){
				largest = number[index];
			}
		}		
		return number; 
	}


}