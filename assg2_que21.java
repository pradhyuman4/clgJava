import java.util.HashMap;
import java.util.Map;

class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}


public class assg2_que21 {

    public static void main(String[] args) {
        // Predefined list of countries and their capitals
        Map<String, String> countryCapitalMap = new HashMap<>();
        countryCapitalMap.put("USA", "Washington, D.C.");
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("Germany", "Berlin");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Japan", "Tokyo");

        if (args.length < 1) {
            System.out.println("Please provide a country name as a command-line argument.");
            return;
        }

        String country = args[0];

        try {
            String capital = findCapital(country, countryCapitalMap);
            System.out.println("The capital of " + country + " is " + capital);
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String findCapital(String country, Map<String, String> countryCapitalMap)
            throws NoMatchFoundException {
        if (countryCapitalMap.containsKey(country)) {
            return countryCapitalMap.get(country);
        } else {
            throw new NoMatchFoundException("NoMatchFoundException: Capital not found for country " + country);
        }
    }
}
