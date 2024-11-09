public class assg2_que20 {
    public static void main(String[] args) {

        try {
            int[] arr = new int[-7];

        } catch (NegativeArraySizeException e) {
            System.out.println("negativearrayindex exception occured" + e.getMessage());
        }
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(" arithmeticexception occured  " + e.getMessage());
        }
    }
}
