package Inheritance.Method_Overloading_inJava.Example_2;

public class Boy extends Human{
    void eat(){
        System.out.println("Boy eat food");
    }
    public static void main(String[] args) {
    Boy b1=new Boy();
    b1.eat();
  	}
}
