package Inheritance.Example_3;
import java.util.Scanner;

public class Student extends Person{
    int id;
    double cgpa;

    public Student(String name,int id ,int age,double cgpa){
        this.name=name;
        this.id=id;
        this.age=age;
        this.cgpa=cgpa;
    }

    void display(){
        System.out.println("Name:"+name+" ID: "+id+" Age: "+age+" CGPA: "+cgpa);
    }

    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name=input.nextLine();

    System.out.print("Enter your ID: ");
    int id=input.nextInt();
    input.nextLine();

    System.out.print("Enter your Age: ");
    int age=input.nextInt();
    input.nextLine();

    System.out.print("Enter your CGPA: ");
    double cgpa=input.nextDouble();
    input.nextLine();


    Student s1=new Student(name,id,age,cgpa);
    s1.display();
  	}
}
