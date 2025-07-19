package Inheritance.Method_Overloading_inJava.Example_2;

public class Girl extends Human {
    void eat(){
        System.out.println("Girl eat food");
    }
    public static void main(String[] args) {
    Girl g1=new Girl();
    g1.eat();
  	}
}
