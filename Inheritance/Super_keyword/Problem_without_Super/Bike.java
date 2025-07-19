package Inheritance.Super_keyword.Problem_without_Super;

public class Bike extends Vehicle {
    int speed=100;
    void display(){
        System.out.println(speed);  //here output is 100 not 50
    }

    public static void main(String[] args) {
        Bike b1=new Bike();
        b1.display();
    }
    
}