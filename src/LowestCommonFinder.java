public class LowestCommonFinder {

    public static int lowestCommon(long a, long b){
        int position = -1;
        long commonbits = a & b;
        for (int i=0; i <= 63; i++){
            if (commonbits % 2 != 0){
                position = i;
                break;
            } else {
                commonbits /= 2;
            }
        }
        return position;
    }

    public static void main(String[] args) {
        System.out.println("Testing lowestCommon(14, 25), expecting 3");
        if (lowestCommon(14l, 25l) == 3){
            System.out.println("Test successful");
        } else {
            System.out.println("Test failed");
        }

        System.out.println("Testing lowestCommon(1, 2), expecting -1");
        if (lowestCommon(1l, 2l) == -1){
            System.out.println("Test successful");
        } else {
            System.out.println("Test failed");
        }
    }
}
