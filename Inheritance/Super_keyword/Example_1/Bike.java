package Inheritance.Super_keyword.Example_1;

public class Bike extends Vehicle{
    int speed=100;
    void display(){
        System.out.println("Bike speed: "+speed);
        System.out.println("Vehicle speed: "+super.speed);
    }

    public static void main(String[] args) {
        Bike b1=new Bike();
        b1.display();
    }
}
