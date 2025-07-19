package Inheritance.Super_keyword.Example_3;

public class Car extends Vehicle {

    public Car(){
        super(100);
        System.out.println("Car is Created");
    }

    void display(){
        System.out.println("Vehicle Speed ="+super.speed);
        System.out.println("Car Speed ="+speed);
    }
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.display();
    }
}
