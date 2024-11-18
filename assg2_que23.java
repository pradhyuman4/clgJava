
import java.util.Scanner;

// Custom exception for TooHot
class TooHot extends Exception {
    public TooHot(String message) {
        super(message);
    }
}

// Custom exception for TooCold
class TooCold extends Exception {
    public TooCold(String message) {
        super(message);
    }
}

public class assg2_que23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the temperature in Celsius: ");
            int temperature = sc.nextInt();

            checkTemperature(temperature);
        } catch (TooHot e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (TooCold e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a numeric value.");
        } finally {
            sc.close();
        }
    }

    public static void checkTemperature(int temperature) throws TooHot, TooCold {
        if (temperature > 35) {
            throw new TooHot("Temperature is too hot! (" + temperature + "°C)");
        } else if (temperature < 5) {
            throw new TooCold("Temperature is too cold! (" + temperature + "°C)");
        } else {
            System.out.println("Temperature is normal. (" + temperature + "°C)");
        }
    }
}