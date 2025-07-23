package Problem.Quize_2;

public class PermanentEmployee extends Employee{
    double salary;
    public PermanentEmployee(String name,int id,double salary){
        super(name,id);
        this.salary=salary;
    }

    void displayIno(){
        System.out.println("Permanent Employee Information: ");
        System.out.println("Name: "+name);
        System.out.println("Name: "+id);
        System.out.println("Salary: "+salary);
    }
}
