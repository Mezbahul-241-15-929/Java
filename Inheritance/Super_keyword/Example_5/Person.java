package Inheritance.Super_keyword.Example_5;

public class Person {
    String name;
    int age;

    public Person(String newName,int newAge){
        this.name=newName;
        this.age=newAge;
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);       
    }
}
