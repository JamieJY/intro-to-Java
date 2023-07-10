package coins;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoinValueProgram {
    public static void main(String[] args) {
        // Create a HashMap to store the coin-value pairs
        Map<String, Integer> coinValueMap = new HashMap<>();
        coinValueMap.put("penny", 1);
        coinValueMap.put("dime", 10);
        coinValueMap.put("quarter", 25);

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a coin: ");
        String coin = scanner.nextLine();

        // Look up the value in the HashMap
        Integer value = coinValueMap.get(coin);

        if (value != null) {
            System.out.println("The value of " + coin + " is: " + value);
        } else {
            System.out.println("Coin not found.");
        }

        // Remember to close the Scanner when you're done
        scanner.close();
    }
}
