
package testingEnvironment; 

import java.util.ArrayList;
import java.util.Scanner;

// Everything inside my cases needed to be changed to methods.
public class RegistrarMenuArrayList22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> courses = new ArrayList<>(); // List to store courses
        boolean finished = false;
        int userChoice;

        while (!finished) {
            // Menu Display
            System.out.println("");
            System.out.println("Course Registrar Menu");
            System.out.println("====================");
            System.out.println(" 1. Add a Course");
            System.out.println(" 2. Remove a Course");
            System.out.println(" 3. Display Courses");
            System.out.println(" 4. Count Computing Courses");
            System.out.println(" 5. Exit");
            System.out.println("");

            // Get the input from the user
            System.out.print("Please input your choice (1-5): ");
            userChoice = input.nextInt();
            input.nextLine(); // Creates new line

            // Switch to correspondence function
            switch (userChoice) {
                case 1:
                    System.out.print("Enter the course name to add: ");
                    String courseToAdd = input.nextLine().toUpperCase(); // Convert to upper case for case-insensitive comparison
                    if (!courses.contains(courseToAdd)) { // Check for duplicate
                        courses.add(courseToAdd);
                        System.out.println("Course '" + courseToAdd + "' added successfully.");
                    } else {
                        System.out.println("Course '" + courseToAdd + "' already exists and was not added.");
                    }
                    break;

                case 2:
                    System.out.print("Enter the course name to remove: ");
                    String courseToRemove = input.nextLine().toUpperCase(); // Convert to upper case for case-insensitive comparison
                    if (courses.remove(courseToRemove)) {
                        System.out.println("Course '" + courseToRemove + "' removed successfully.");
                    } else {
                        System.out.println("Course '" + courseToRemove + "' does not exist.");
                    }
                    break;

                case 3:
                    System.out.println("Current list of courses:");
                    for (String course : courses) {
                        System.out.println(course);
                    }
                    break;

                case 4:
                    int computingCourseCount = countComputingCourses(courses);
                    System.out.println("Number of computing courses (starting with 'COMP'): " + computingCourseCount);
                    break;

                case 5:
                    finished = true;
                    break;

                default:
                    System.out.println("Invalid Input!\n");
                    break;
            } // end switch
        } // end while
        input.close(); // Close the scanner
    }

    // Method to count computing courses
    private static int countComputingCourses(ArrayList<String> courses) {
        int count = 0;
        for (String course : courses) {
            if (course.length() >= 4 && course.substring(0, 4).equalsIgnoreCase("COMP")) {
                count++;
            }
        }
        return count;
    }
}
