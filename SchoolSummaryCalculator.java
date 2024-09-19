package testingEnvironment;
import java.util.Scanner;

public class SchoolSummaryCalculator {

    public static void main(String[] args) {
        
        Scanner summaryCalculator = new Scanner(System.in);
        
        System.out.println("Please enter your name below.");
        String yourName = summaryCalculator.nextLine(); 
        
        System.out.println("Welcome " + yourName + ", to the School Summary Calculator");
        System.out.println("Please enter your exam score (0-100) below.");
        int examScore = summaryCalculator.nextInt();
        
        String gradeEquivalent;
        if (examScore < 60) {
            gradeEquivalent = "F";
        } else if (examScore >= 60 && examScore <= 62) {
            gradeEquivalent = "D-";
        } else if (examScore >= 63 && examScore <= 66) { 
            gradeEquivalent = "D";
        } else if (examScore >= 67 && examScore <= 69) {
            gradeEquivalent = "D+";
        } else if (examScore >= 70 && examScore <= 72) {
            gradeEquivalent = "C-";
        } else if (examScore >= 73 && examScore <= 76) {
            gradeEquivalent = "C";
        } else if (examScore >= 77 && examScore <= 79) {
            gradeEquivalent = "C+";
        } else if (examScore >= 80 && examScore <= 82) {
            gradeEquivalent = "B-";
        } else if (examScore >= 83 && examScore <= 86) {
            gradeEquivalent = "B";
        } else if (examScore >= 87 && examScore <= 89) {
            gradeEquivalent = "B+";
        } else if (examScore >= 90 && examScore <= 92) {
            gradeEquivalent = "A-";
        } else if (examScore >= 93 && examScore <= 96) {
            gradeEquivalent = "A";
        } else if (examScore >= 97 && examScore <= 100) {
            gradeEquivalent = "A+";
        } else {
            gradeEquivalent = "Invalid Score"; // Handle cases outside 0-100 range
        }

        System.out.print("Lastly, what is your academic standing?"); 
        System.out.println(" Freshman = 1, Sophomore = 2, Junior = 3, Senior = 4, or Unknown = 5)? ");
        int academicStanding = summaryCalculator.nextInt();

        String gradeLevelName;
        switch (academicStanding) {
            case 1:
                gradeLevelName = "Freshman";
                break;
            case 2:
                gradeLevelName = "Sophomore";
                break;
            case 3:
                gradeLevelName = "Junior";
                break;
            case 4:
                gradeLevelName = "Senior";
                break;
            case 5:
                gradeLevelName = "Unknown";
                break;
            default:
                gradeLevelName = "Unknown";  // A default case to handle any unexpected input
                break;
        }

        System.out.println();
        System.out.println("Your Calculated Academic Summary (CAS) is the following: ");
        System.out.println();
        System.out.println(yourName + ", you are a " + gradeLevelName + " that scored " + examScore + " on the exam with a letter grade of " + gradeEquivalent + ".");
        
        summaryCalculator.close();
    }
}



