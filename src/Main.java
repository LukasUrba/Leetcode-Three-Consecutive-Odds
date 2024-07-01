import java.sql.Array;

public class Main {
    public static void main(String[] args) {

//        System.out.println(threeConsecutiveOdds(new int[]{2,6,4,1}));
//        System.out.println(threeConsecutiveOdds(new int[]{1,2,34,3,4,5,7,23,12}));
        System.out.println(threeConsecutiveOdds(new int[]{1,2,1,1}));

    }

    public static boolean threeConsecutiveOdds(int[] arr) {
        int counter = 0;

        for(int number : arr) {
            if (counter>=3) {
                return true;
            }
            if(number%2!=0) {
                counter++;
            } else {
                counter = 0;
            }
        }
        return counter >= 3;
    }
}