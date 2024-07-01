
public class Main {
    public static void main(String[] args) {

//        System.out.println(threeConsecutiveOdds(new int[]{2,6,4,1}));
//        System.out.println(threeConsecutiveOdds(new int[]{1,2,34,3,4,5,7,23,12}));
        System.out.println(threeConsecutiveOdds(new int[]{1,2,1,1}));

    }

    public static boolean threeConsecutiveOdds(int[] arr) {
        int counter = 0;

        for(int number : arr) {

            if(number%2!=0) {
                counter++;
            } else {
                counter = 0;
            }
//            Check is done at the end of iteration to not need to start another loop before exiting
            if (counter>=3) {
                return true;
            }
        }
        return false;
    }
}