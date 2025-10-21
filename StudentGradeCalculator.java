import java.util.Scanner;

public class StudentGradeCalculator {

  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = sc.nextLine();

        System.out.print("Enter score in Math: ");
        double math = sc.nextDouble();

        System.out.print("Enter score in Science: ");
        double science = sc.nextDouble();

        System.out.print("Enter score in English: ");
        double english = sc.nextDouble();

        double average = (math + science + english) / 3;
        String grade = calculateGrade(average);

        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + name);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        sc.close();
    }

     private static String calculateGrade(double avg) {
        if(avg >= 90) return "A";
        if(avg >= 80) return "B";
        if(avg >= 70) return "C";
        if(avg >= 60) return "D";
        return "F";
    }
}
