package Problem.Lab_Evulatioon_3;

public class Bike extends Vehicle{
    String hasCarrier ;
    String type;

    public Bike(int vehicleNumber,String brand,int engineCapacity,String hasCarrier,String type){
        super(vehicleNumber,brand,engineCapacity);
        this.hasCarrier=hasCarrier;
        this.type=type;
    }


    public void displayDetails(){
        System.out.println("--- Bike Details ---");
        System.out.println("Vehicle Number: C-"+vehicleNumber);
        System.out.println("Brand: "+brand);
        System.out.println("Engine Capacity: "+engineCapacity+"cc");
        System.out.println("Type: "+type);
        System.out.println("Carrier Info: "+hasCarrier+"\n");
    }
}