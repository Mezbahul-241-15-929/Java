package ObjectClass;

public class Person_02 {
    String name;
    int age;

    public void display(){
        System.out.println("Name: "+name+" Age: "+age);
    }
    public static void main(String[] args) {
        
        Person_02 person1 = new Person_02();
        person1.name = "Alice";
        person1.age = 25;

        Person_02 person2 = new Person_02();
        person2.name = "Bob";
        person2.age = 30;

        // System.out.println("Person 1 Name: " + person1.name);
        // System.out.println("Person 1 Age: " + person1.age);

        // System.out.println("Person 2 Name: " + person2.name);
        // System.out.println("Person 2 Age: " + person2.age);

        person1.display();
        person2.display();
    }
}
