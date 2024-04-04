import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


              //Input: take marks obtained (out of 100) in subjectṅ
        System.out.println("enter the number of subjects ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("Enter marks obtained in subjects " + i + ":");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }
        //calculate total marks
        System.out.println("total marks: " + totalMarks);

        //calculate average percentage
        double averagePercentage = (double) totalMarks / numSubjects;
        System.out.println("Average Percentage: "+ averagePercentage + "%");

        //grade Calculation:Assign grades based on the average percentage achived
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'c';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade:"  + grade); //display results

        scanner.close();
    }
    
}