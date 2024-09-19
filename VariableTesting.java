package testingEnvironment; //!! ALL CODE SHOULD COME AFTER THE PACKAGE STATEMENT !!

import java.util.Scanner; // !! YOU MUST IMPORT A SCANNER BEFORE YOU CREATE ONE !!



public class VariableTesting {

	
	public static void main(String[] args) {
		
		// This creates a new scanner. It specifies it's name as well as the
		Scanner inputAge = new Scanner (System.in); //!! YOU MUST CREATE A SCANNER
		
		// Prompt the user to input their age
		System.out.println(" Welcome, please enter your age below.");
		
		// This stores the user's input in a variable called userAge
		int userAge = inputAge.nextInt(); // The value we assigned to this variable is a Statement. Meaning: It's a singular value
		// You can assign expressions as the value for a variable. This type of Initialization is called an Assignment Expression.
		// Examples of Assignment Expressions would be: int addNumbers = 5+3;
		
		// int userAge is the variable Declaration. 
		// int is the type of variable and userAge is the name 
		// userAge is where the value of int (integers) will be stored
		// = inputAge.nextInt(); is Initialization, this is the process of assigning value to the variable
		
		
		System.out.print("You are "+userAge+" years old"); // This outputs a message containing the variable userAge
			
		inputAge.close();
		
	}

}
