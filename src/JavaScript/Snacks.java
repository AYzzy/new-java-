package JavaScript;

public class Snacks {
    public int [] reverseNumber(int [] number){
        int[] num = new int[number.length];
        int index =0;
        for(int count =0;count < number.length;count++){
            index = number.length-1 -count;
            num[index] = number[count];
        }
        return num;
    }
    public int[] reverseNumber2(int[] number) {
        return number;
    }
}
