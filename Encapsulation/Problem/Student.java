package Encapsulation.Problem;

public class Student {
    private String name;
    private int id;
    private double marks;

    public Student(String name, int id, double marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }
}
