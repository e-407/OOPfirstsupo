public class MathUtil {

    public static int max(int a, int b){
        if (a>b){
            return a;
        } else{
            return b;
        }
    }

    public static double max(double a, double b){
        if (a>b){
            return a;
        } else{
            return b;
        }
    }

    public static void main (String[] args){
        System.out.println("Testing ints 5 and 6, expecting 6");
        if (max(5, 6) == 6){
            System.out.println("Test successful");
        } else {
            System.out.println("Test failed");
        }

        System.out.println("Testing floats 5.0 and 6.0, expecting 6.0");
        if (max(5.0, 6.0) == 6.0){
            System.out.println("Test successful");
        } else {
            System.out.println("Test failed");
        }
    }
}
