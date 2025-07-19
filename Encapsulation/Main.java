package Encapsulation;

public class Main {
    
    public static void main(String[] args) {
    Student obj= new Student();

    obj.setName("Mezbahul");
    obj.setAge(23);

    obj.display();

    //Using getter method
    System.out.println("Student Info with Getter method:");
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
  	}

}
