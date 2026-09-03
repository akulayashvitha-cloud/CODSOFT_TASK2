import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] subjects = {
            "Java",
            "Data Structures",
            "Operating Systems",
            "Computer Networks",
            "Database Management"
        };

        int total = 0;

        System.out.println("======================================");
        System.out.println("       CODSOFT JAVA INTERNSHIP");
        System.out.println("       TASK 2 - GRADE CALCULATOR");
        System.out.println("======================================");

        for (String subject : subjects) {

            int marks;

            while (true) {
                System.out.print("Enter marks for " + subject + " (0-100): ");

                if (sc.hasNextInt()) {
                    marks = sc.nextInt();

                    if (marks >= 0 && marks <= 100) {
                        break;
                    } else {
                        System.out.println(
                            "Invalid marks! Please enter between 0 and 100."
                        );
                    }

                } else {
                    System.out.println("Invalid input! Please enter a number.");
                    sc.next();
                }
            }

            total += marks;
        }

        double average = total / (double) subjects.length;

        String grade;

        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n======================================");
        System.out.println("           RESULT");
        System.out.println("======================================");

        System.out.println("Total Marks      : " + total +
                           " / " + (subjects.length * 100));

        System.out.printf("Average Percentage: %.2f%%\n", average);

        System.out.println("Grade            : " + grade);

        System.out.println("======================================");
        System.out.println("       Thank you!");
        System.out.println("======================================");

        sc.close();
    }
}