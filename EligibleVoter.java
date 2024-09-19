// This program checks if you are eligible to vote in the United States.
package testingEnvironment;

import java.util.Scanner; // 1: This is inputing a scanner. Allowing it to exsist within the code

public class EligibleVoter {

    public static void main(String[] args) {
    
        Scanner canYouVote = new Scanner(System.in); // 2. This creates the scanner. Along with giving it a name
        
        System.out.println("Please enter your age below:");
        int userAge = canYouVote.nextInt();
        
        // Check if the user is under 18 first
        if (userAge < 18) {
            System.out.println("You are not eligible to vote due to your age.");
        } else {
            System.out.println("Are you a registered voter? Enter 'Yes' or 'No':");
            String isRegisteredVoterInput = canYouVote.next(); // 3: This allows the scanner to read input from the user
            /*
             This is a method of the Scanner class that reads the 
             next token of input as a String. A "token" here refers to a word
             or sequence of characters that is separated by whitespace. 
             So, canYouVote.next(); captures the next word or string of characters
             entered by the user.
             */
       
            
            // Convert the input to a boolean
            boolean isRegisteredVoter = isRegisteredVoterInput.equalsIgnoreCase("Yes");

            // Check voter registration status
            if (isRegisteredVoter) {
                System.out.println("That's Awesome 👍");
            } else {
                System.out.println("You should become a registered voter.");
            }
        }

        // Close the scanner
        canYouVote.close();
    }
}

