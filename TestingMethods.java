package testingEnvironment;
import java.util.Scanner;

public class TestingMethods {

    public static void main(String[] args) {
        Scanner yourInput = new Scanner(System.in);

        System.out.println("Welcome to Compare & Explain. A program where I compare your inputted decimals, and you explain the output.");
        System.out.println("Please enter a decimal value:");
        
        double decimalOne = yourInput.nextDouble();
       
        System.out.println("Please enter your next decimal value:");
        double decimalTwo = yourInput.nextDouble();
        
        System.out.println("Now comparing the two decimals...");

        // Call the second method to compare the inputted decimals
        decimalResult(decimalOne, decimalTwo);
        
        yourInput.close();
    }

    // Method to compare two decimals
    public static void decimalResult(double decimalOne, double decimalTwo) {
        if (decimalOne > decimalTwo) { 
            System.out.println(decimalOne + " is greater than " + decimalTwo + ". Can you explain why?"); 
        } else if (decimalTwo > decimalOne) { 
            System.out.println(decimalTwo + " is greater than " + decimalOne + ". Can you explain why?"); 
        } else { 
            System.out.println("Both values are equal."); 
        }
    }
}
