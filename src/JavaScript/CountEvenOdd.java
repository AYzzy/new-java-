package JavaScript;

public class CountEvenOdd {

    public int[] evenOddCount(int[] actual) {
        int even = 0;
        int odd = 0;
        for(int count =0 ; count < actual.length ;count++){
            if (actual[count] % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }
        return new int[]{even ,odd};
    }
}
