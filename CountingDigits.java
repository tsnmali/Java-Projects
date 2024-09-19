package testingEnvironment;

import java.util.Scanner; // Scanners must be imported before they can be used within a method

public class CountingDigits {

	public static void main(String[] args) {
		

		System.out.println("Hey, can you see me!?");
		
		// my first comment!
		/* 
		MY first multi-line comment
		 */
		
		// Create a new scanner
		Scanner scannerfornumbers = new Scanner (System.in);
		
		// Define my favorite number
		
		String favoritenumber = "33";
		
		// Prompt the user to input a number as well as asses the type of input the user can enter
		
		System.out.println("Try entering a number below. It can be any number you wish");
		String inputNumber = scannerfornumbers.nextLine();
	
		
		// Receive the input from the user and check the digits
		 int howManyDigits = inputNumber.length();
		 
		 // Output the number of digits that the user entered
		 
		 System.out.println("This number has "+ howManyDigits +" digits.");
		 
		 // Check if the input number matches my favorite number
		 if (inputNumber.equals(favoritenumber))
		 { System.out.println("This is also my favorite number btw!");
		 
		 }
		 scannerfornumbers.close(); 
		 /* 
		  Make sure that the name for the scanner is written correctly when you try to close it
		  */

				
		System.out.println("Isn't this super fun!");
	}

}
