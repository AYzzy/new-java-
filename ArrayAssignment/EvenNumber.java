public class EvenNumber{

	public int[] getEvenNumber(int [] number){
		int [] even = new int[number.length];
		for(int index =0; index < number.length ; index++){
			if(number[index] % 2 == 0){
				even[index] = number[index];
			}
		}
		return even;
	}


}
