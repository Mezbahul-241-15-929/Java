package Abstraction.Abstract_Class.Example_3;

public class Truck extends Vehicle{
    public void move(){
        System.out.println("Truck moves slow");
    }

    public static void main(String[] args) {
        Truck t1=new Truck();
        t1.move();
        t1.carry();
    }
}
