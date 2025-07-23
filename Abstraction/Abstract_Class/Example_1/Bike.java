package Abstraction.Abstract_Class.Example_1;

public class Bike extends Vehicle{
    public void move(){
        System.out.println("Bike moves with two wheels");
    }

    public static void main(String[] args) {
        Bike b1=new Bike();

        b1.move();
    }
}
