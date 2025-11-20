public class TailRecursionTest {

    public static int increment (int initialValue, int times){
        if (times <= 0){
            return initialValue;
        } else {
            return increment(initialValue + 1, times - 1);
        }
    }

    public static void main(String[] args){
        System.out.println("Attempting to increment 0 by 1,000,000");
        int result = TailRecursionTest.increment(0, 1000000);
        System.out.println("Tail recursion effectively implemented.");
    }
}
