package Array_3Dimentional;

public class NutAndCrosses {
    public String[][] convertNutAndCross(int[][] actual) {
        String [][] actualMain = new String[actual.length][actual.length];
        for(int count =0; count< actualMain.length;count++){
            for(int counter=0;counter< actualMain.length;counter++){
                if(actual[count][counter] == 1){
                    actualMain[count][counter] = "*";
                }
                else if(actual[count][counter]==0){
                    actualMain[count][counter]= " ";
                }
            }
        }
        return actualMain;
    }
}
