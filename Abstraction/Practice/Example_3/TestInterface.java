package Abstraction.Practice.Example_3;

public class TestInterface {
    public static void main(String[] args) {
        SIBL s=new SIBL();
        DBBL s2=new DBBL();

        double a= s.account();
        double b= s2.account();

        System.err.println("SIBL balance: "+a);
        System.err.println("DBBL balance: "+b);
    }
}
