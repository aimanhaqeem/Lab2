import java.util.Scanner;

public class Lab2_Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalMarks = 0;

        System.out.println("How many marks you want to insert : 3");
        System.out.println("Please enter mark no 1");
        double mark1 = scanner.nextDouble();
        System.out.println("Mark :" + mark1 + " has been inserted");
        totalMarks += mark1;

        System.out.println("Please enter mark no 2");
        double mark2 = scanner.nextDouble();
        System.out.println("Mark :" + mark2 + " has been inserted");
        totalMarks += mark2;

        System.out.println("Please enter mark no 3");
        double mark3 = scanner.nextDouble();
        System.out.println("Mark :" + mark3 + " has been inserted");
        totalMarks += mark3;

        System.out.println("Total mark is :" + totalMarks);

        scanner.close();
    }
}