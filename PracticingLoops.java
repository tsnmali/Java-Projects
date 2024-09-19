
package testingEnvironment;

public class PracticingLoops {

	
	public static void main(String[] args) 
	
	// While Loop
	
	{
	
		int fiveTimesTable = 5;
		
		while (fiveTimesTable <= 50000000) {
			
		System.out.println(fiveTimesTable);	
			fiveTimesTable = fiveTimesTable * 10;
			
			System.out.println("__________");
				
		}
		
		// Do-While Loop
		
		String movingOn="Now Let's try something new ";

		System.out.println(movingOn);
		
		int tenTimesTable = 10;
		
		do {
			System.out.println(tenTimesTable);
			tenTimesTable = tenTimesTable * 10;
			System.out.println("__________");
		
		   } while (tenTimesTable <= 1000); // <= Means "Less than or Equal too"
		
	
		// Now let's do a For Loop
		String nextPart = "Now you're getting the hang of it! Try this next! ";
		System.out.println(nextPart);
		for (int fifteenTimesTable = 15; fifteenTimesTable <=8167432; fifteenTimesTable = fifteenTimesTable * 15) {

             System.out.println(fifteenTimesTable);
             System.out.println(" __________");
		}


		
	}

}
