// WAP in java to display grade of a student using switch case statement with conditions (90-100 marks -- O grade , 80-89 -- A, till 50 - 59 -- F grade)

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks: ");
        int marks = scanner.nextInt();

        char grade;
        switch (marks / 10) {
            case 10:
            case 9:
                grade = 'O';
                break;
            case 8:
                grade = 'A';
                break;
            case 7:
                grade = 'B';
                break;
            case 6:
                grade = 'C';
                break;
            case 5:
                grade = 'D';
                break;
            case 4:
                grade = 'E';
                break;
            default:
                grade = 'F';
                break;
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
