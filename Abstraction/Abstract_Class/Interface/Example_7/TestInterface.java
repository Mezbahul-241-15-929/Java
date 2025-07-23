package Abstraction.Abstract_Class.Interface.Example_7;

public class TestInterface {
    public static void main(String[] args) {
        Bank b = new SIBL();
        System.out.println("SIBL Balance: " + b.account());

        Bank d = new DBBL();
        System.out.println("DBBL Balance: " + d.account());
    }
}
