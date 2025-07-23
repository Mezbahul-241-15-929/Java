package Abstraction.Abstract_Class.Example_3;

public abstract class Vehicle {

    // 33.33% abstract

    public Vehicle(){
        System.out.println("Vehicle is created");
    }

    public abstract void move();

    public void carry(){
        System.out.println("All vehicle carry loads");
    }
}
