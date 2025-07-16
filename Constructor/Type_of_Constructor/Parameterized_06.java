package Constructor.Type_of_Constructor;

public class Parameterized_06 {
    int id;
    String name;
    public Parameterized_06(int newId,String newName){
        this.id=newId;
        this.name=newName;
    }

    void display(){
        System.out.println("ID: "+id+" Name: "+name);
    }

    public static void main(String args[]){
        Parameterized_06 per1= new Parameterized_06(929,"Mezbahul");
        Parameterized_06 per2= new Parameterized_06(565,"Shahin");

        per1.display();
        per2.display();
    }

}
