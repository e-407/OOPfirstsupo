public class ReferenceTest {
    public static void arrayTest(int[] array){
        array = new int[] {1, 4, 3};
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 3};
        arrayTest(test);
        System.out.println(test[1]);
    }
}
