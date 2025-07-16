package Constructor.Type_of_Constructor;
import java.util.Scanner;


public class Parameterized_07_UserInput {
    int id;
    String name;
    public Parameterized_07_UserInput(int newId,String newName){
        this.id=newId;
        this.name=newName;
    }

    void display(){
        System.out.println("ID: "+id+" Name: "+name);
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("First Person: ");
        System.out.print("Id: ");
        int inputID= input.nextInt();
        input.nextLine();

        System.out.print("Name: ");
        String inputName= input.nextLine();

        System.out.println("Second Person: ");
        System.out.print("Id: ");
        int inputID2= input.nextInt();
        input.nextLine();

        System.out.print("Name: ");
        String inputName2= input.nextLine();

        Parameterized_07_UserInput per1= new Parameterized_07_UserInput(inputID,inputName);
        Parameterized_07_UserInput per2= new Parameterized_07_UserInput(inputID2,inputName2);

        per1.display();
        per2.display();
    }
}
