package Abstraction.Practice.Example_1;

public abstract class Vehicle {
    public Vehicle(){
        System.out.println("Vehicle created");
    }

    public abstract void move();

    public void carry(){
        System.err.println("Carry");
    }
}
