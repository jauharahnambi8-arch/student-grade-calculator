package studentgrades;

import java.util.Scanner;

// Student Grade Calculator
// This program asks for a student's marks in 5 subjects,
// then works out the average and tells us if the student passed or failed.

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String again = "yes";   // controls the WHILE loop

        System.out.println("=== STUDENT GRADE CALCULATOR ===");

        // WHILE LOOP:
        // Keeps running as long as the user types "yes"
        while (again.equals("yes")) {

            System.out.print("\nEnter student name (one word): ");
            String name = input.next();

            int total = 0;   // stores the sum of all marks

            // FOR LOOP:
            // Repeats 5 times, once for each subject
            for (int subject = 1; subject <= 5; subject++) {

                int mark;

                // DO-WHILE LOOP:
                // Asks for the mark at least once,
                // and keeps asking if the mark is not between 0 and 100
                do {
                    System.out.print("Enter mark for subject " + subject + " (0-100): ");
                    mark = input.nextInt();

                    if (mark < 0 || mark > 100) {
                        System.out.println("Invalid mark! Try again.");
                    }
                } while (mark < 0 || mark > 100);

                total = total + mark;   // add the mark to the total
            }

            int average = total / 5;

            // TERNARY STATEMENT:
            // Short way of writing if/else
            // If average is 50 or more -> "PASS", otherwise -> "FAIL"
            String result = (average >= 50) ? "PASS" : "FAIL";

            // Another ternary: give a grade message
            String comment = (average >= 75) ? "Excellent work!" : "Keep working hard!";

            System.out.println("\n--- RESULT ---");
            System.out.println("Student: " + name);
            System.out.println("Total marks: " + total + " out of 500");
            System.out.println("Average: " + average);
            System.out.println("Result: " + result);
            System.out.println(comment);

            System.out.print("\nDo you want to add another student? (yes/no): ");
            again = input.next();
        }

        System.out.println("\nThank you for using the program. Goodbye!");
    }
}
