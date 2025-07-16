package Inheritance;

public class Student extends Person {
    private int id;
    private double cgpa;

    public void Display(){
        System.out.println("Name: "+name);
        System.out.println("Age : "+age);
        System.out.println("Id  : "+id);
        System.out.println("CGPA: "+cgpa);
    }
    public static void main(String[] args) {
        Student st1 = new Student();

        st1.name="Mezbahul";
        st1.age=21;
        st1.id=929;
        st1.cgpa=3.33;
        
        st1.Display();
        st1.message();
    }
}
