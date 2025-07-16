package Encapsulation;
//using constructor
public class Encapsulation_03 {
    private String name;
    private int age;

    //constructor
    public Encapsulation_03(String newName,int newAge){
        this.name=newName;
        this.age=newAge;
    }

    //setter method
    public void setName(String newName){
        this.name=newName;
    }
    public void setAge(int newAge){
        this.age=newAge;
    }

    //getter method
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }

}
