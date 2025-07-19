package Encapsulation.Problem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student2> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Marks: ");
            double marks = scanner.nextDouble();

            // Use setter methods to assign values
            Student2 s = new Student2();
            s.setId(id);
            s.setName(name);
            s.setMarks(marks);

            students.add(s);
        }

        // Display using displayInfo() which uses getter methods
        System.out.println("\n--- All Student Records ---");
        for (Student2 s : students) {
            s.displayInfo();
        }

        scanner.close();
    }
}
