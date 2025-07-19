package Inheritance.Example_1;

public class Programmer extends Employee {
    float bonus = 10000;

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programmer salary is:" + p.salary);
        System.out.println("Bonus of Programmer is:" + p.bonus);
    }
}
