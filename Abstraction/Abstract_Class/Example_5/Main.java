package Abstraction.Abstract_Class.Example_5;

public class Main {
    public static void main(String[] args) {
        Human h1=new Human();
    h1.eat();
    h1.move();
    h1.talk();

    Lion l1=new Lion();
    l1.eat();
    l1.move();
    l1.hunt();

    Bird b1=new Bird();
    b1.eat();
    b1.move();
    b1.fly();
    }
}
