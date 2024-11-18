class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}


public class assg2_que22 {


    public static int calculateEquation(int a, int b, int c) throws CustomArithmeticException {
        try {

            if (b == 0) {
                throw new CustomArithmeticException("Division by zero is not allowed.");
            }

            int result = Math.addExact(a / b, c);
            return result;
        } catch (ArithmeticException e) {
            throw new CustomArithmeticException("Arithmetic overflow occurred.");
        }
    }

    public static void main(String[] args) {
        try {
            int a = 100;
            int b = 0;
            int c = Integer.MAX_VALUE;

            System.out.println("Result: " + calculateEquation(a, b, c));
        } catch (CustomArithmeticException e) {
            System.err.println("Custom Exception Caught: " + e.getMessage());
        }

        try {
            int a = 100;
            int b = 2;  // Valid divisor
            int c = Integer.MAX_VALUE;

            System.out.println("Result: " + calculateEquation(a, b, c));
        } catch (CustomArithmeticException e) {
            System.err.println("Custom Exception Caught: " + e.getMessage());
        }
    }
}


