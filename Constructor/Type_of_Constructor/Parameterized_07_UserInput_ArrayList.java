package Constructor.Type_of_Constructor;

import java.util.ArrayList;
import java.util.Scanner;

public class Parameterized_07_UserInput_ArrayList {
    int id;
    String name;

    public Parameterized_07_UserInput_ArrayList(int id, String name) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("ID: " + id + " Name: " + name);
    }

    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    ArrayList<Parameterized_07_UserInput_ArrayList> people =new ArrayList<>();

    System.out.print("Enter Total Person: ");
    int size=input.nextInt();
    input.nextLine();

    for(int i=0;i<size;i++){
        System.out.println("Person "+(i+1)+" info: ");
        System.out.print("Id: ");
        int inputID= input.nextInt();
        input.nextLine();

        System.out.print("Name: ");
        String inputName= input.nextLine();
        Parameterized_07_UserInput_ArrayList person = new Parameterized_07_UserInput_ArrayList(inputID,inputName);
        people.add(person);
    }

    System.out.println("\n--- Displaying All Persons ---");
    for(Parameterized_07_UserInput_ArrayList p: people){
        p.display();
    }




  	}
}
