public class ArrayFunction{

	public int[] getEvenNumber(int [] number){
		int [] even = new int[number.length];
		for(int index =0; index < number.length ; index++){
			if(number[index] % 2 == 0){
				even[index] = number[index];
			}
		}
		return even;
	}

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