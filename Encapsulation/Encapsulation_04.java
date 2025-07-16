package Encapsulation;

public class Encapsulation_04 {
    public static void main(String[] args) {
        Encapsulation_03 p1=new Encapsulation_03("Mezbahul",20);

        System.out.println("With construction");
        System.out.println("Name : "+p1.getName());
        System.out.println("Name : "+p1.getAge());


        //Getter method
        p1.setName("Mezbahul Islam");
        p1.setAge(21);

        System.out.println("With setter method");
        System.out.println("Name : "+p1.getName());
        System.out.println("Name : "+p1.getAge());
    }
}
