package JavaScript;

public class HighestLowest {
    public int [] highLow (int [] number ){
        int lowest =number[0];
        int highest =number[0];
        for (int i : number) {
            if (i < lowest) {
                lowest = i;
            }
            if(i > highest) {
                highest = i;
            }
        }

        return new int[]{lowest,highest};
    }
    public int[] highLow2(int[] numbers) {


        int lowest = numbers[0];
        int highest = numbers[0];

        for (int number : numbers) {
            if (number < lowest) {
                lowest = number;
            }
            else{
                highest = number;
            }
        }

        return new int[]{lowest, highest};
    }
}




