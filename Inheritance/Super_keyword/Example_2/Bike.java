package Inheritance.Super_keyword.Example_2;

public class Bike extends Vehicle{
    int speed=50;

     public void display(){
        super.display();
        System.out.println("Bike speed: "+speed);
     }
     public static void main(String[] args) {
        Bike b2=new Bike();
        b2.display();
     }
}
