package Inheritance.Method_Overloading_inJava.Example_1;

public class Bike extends Vehicle {
    void run(){
        System.out.println("Bike is running");
    }
    public static void main(String[] args) {
    Bike b1=new Bike();
    b1.run();
  	}
}
