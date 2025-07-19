package Encapsulation.Problem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Marks: ");
            double marks = scanner.nextDouble();
            
            Student s= new Student(name,id,marks);

            students.add(s);        
        }

        for(Student s: students){
            s.displayInfo();
        }
    }
}
