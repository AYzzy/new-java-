public class LargestNumber{

	public int getLargestNumber(int [] number){

		int largest = number[0] ;
		for(int index =0; index < number.length ; index++){
			if(number[index] > largest){
				largest = number[index];
			}
		}		
		return largest; 
	}


}