package Encapsulation.Problem;

public class Student2 {
    private String name;
    private int id;
    private double marks;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getMarks() {
        return marks;
    }

    // Display using getter methods
    public void displayInfo() {
        System.out.println("ID: " + getId() + ", Name: " + getName() + ", Marks: " + getMarks());
    }
}
