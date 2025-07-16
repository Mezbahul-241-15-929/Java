package Encapsulation;

public class Encapsulation_01 {
    private String name;
    private int age;

    //Setter
    public void setName(String newName){
        this.name=newName;
    }
    public void setAge(int newAge){
        this.age=newAge;
    }

    //Getter
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
