package Inheritance.Super_keyword.Example_5;

public class Student extends Person {
    int id;
    double cgpa;

    public Student(String name,int age,int id,double cgpa){
        super(name,age);
        this.id=id;
        this.cgpa=cgpa;
        System.out.println("Student is created");
    }

    public void display(){
        super.display();
        System.out.println("ID: "+id);
        System.out.println("CGPA: "+cgpa); 
    }
    
    public static void main(String[] args) {
        Student s1=new Student("Mezbahul",22,929,3.33);
        s1.display();

    }
}
