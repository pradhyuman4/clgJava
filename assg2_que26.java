import java.util.Scanner;

class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}



public class assg2_que26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input name and age
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();


            if (age < 0) {
                throw new NegativeAgeException("Age cannot be negative.");
            }

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        } catch (NegativeAgeException e) {
            System.err.println("Exception Caught: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}



