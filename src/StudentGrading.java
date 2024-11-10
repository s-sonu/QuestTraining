import java.util.Scanner;

public class StudentGrading {
    public static final int MAX_SCORE = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentCount;
        System.out.print("Enter the number of students : ");
        studentCount = scanner.nextInt();
        String[] studentNames = new String[studentCount];
        int[] studentScores1 = new int[studentCount];
        int[] studentScores2 = new int[studentCount];
        int[] studentScores3 = new int[studentCount];//arrays to store name and marks
        int totalScores=0;
        double averageScores=0;
        char[] grades=new char[studentCount];
        //input for each student
        for (int i = 0; i < studentCount; i++) {

            System.out.print("\nEnter the name of student " + (i + 1) + ": ");
            scanner.nextLine();
            studentNames[i] = scanner.nextLine();
            System.out.print("Enter the score for maths (0-100): ");
            studentScores1[i] = scanner.nextInt();
            if (studentScores1[i] < 0 || studentScores1[i] > MAX_SCORE)//validating the mark
            {
                System.out.println("Invalid score. Score must be between 0 and 100.");break;
            }
            System.out.print("Enter the score for Science (0-100): ");
            studentScores2[i ] = scanner.nextInt();
           if (studentScores2[i ] <0 || studentScores2[i ] > MAX_SCORE) {
                System.out.println("Invalid score. Score must be between 0 and 100.");

           }
            System.out.print("Enter the score for English (0-100): ");
            studentScores3[i ] = scanner.nextInt();
            if (studentScores3[i] < 0 || studentScores3[i ] > MAX_SCORE) {
                System.out.println("Invalid score. Score must be between 0 and 100.");
                break;
            }
            int total = 0;
            total = studentScores3[i]+studentScores2[i]+studentScores1[i];
            System.out.println("Total Score:" + total);
            averageScores = total / 3;
            System.out.println("Average score:" + averageScores);
            //printing the grades
            if (averageScores >= 90) {
                grades[i] = 'A';
                System.out.println("Grade" + grades[i]);
            } else if (averageScores >= 80 && averageScores < 90) {
                grades [i]= 'B';
                System.out.println("Grade" + grades[i]);
            } else if (averageScores >= 70 && averageScores < 80) {
                grades[i] = 'C';
                System.out.println("Grade" + grades[i]);
            } else if (averageScores >= 60 && averageScores < 70) {
                grades[i]= 'D';
                System.out.println("Grade" + grades[i]);

            } else if (averageScores < 60) {
                grades[i] = 'F';
                System.out.println("Grade" + grades[i]);

            }
            //printing the feedback
            switch (grades[i]) {
                case 'A':
                    System.out.println("Excellent perfomance");
                    break;
                case 'B':
                    System.out.println("Good job ,but you can aim higher");
                    break;
                case 'C':
                    System.out.println("You need to put more efforts");
                    break;
                case 'D':
                    System.out.println("Your perfomance is below expectation");
                    break;
                case 'F':
                    System.out.println("Failure");
                    break;

            }

        }


    }


}