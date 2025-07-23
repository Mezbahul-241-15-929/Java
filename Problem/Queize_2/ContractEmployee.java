package Problem.Queize_2;

public class ContractEmployee extends Employee{
    int duration;
    public ContractEmployee(String name,int id,int duration){
        super(name,id);
        this.duration=duration;
    }

    void displayIno(){
        System.out.println("Contract Employee Information: ");
        System.out.println("Name: "+name);
        System.out.println("Name: "+id);
        System.out.println("Duration: "+duration+" Months");
    }

    public static void main(String[] args) {
        PermanentEmployee em1=new PermanentEmployee("Alice",101,4000.00);
        ContractEmployee em2=new ContractEmployee("Bob",102,5);

        em1.displayIno();
        em2.displayIno();
    }
}
