package Encapsulation;

public class Student {
    private String name;
    private int age;

    //Setter
    public void setName(String name){
      this.name=name;
    }
    public void setAge(int age){
      this.age=age;
    }

    //getter
    public String getName(){
      return name;
    }
    public int getAge(){
      return age;
    }

    //Using withour Getter method
    void display() {
          System.out.println("Student Info without Getter method:");
        System.out.println("Name: " + name + " \nAge: " + age);
    }

}



