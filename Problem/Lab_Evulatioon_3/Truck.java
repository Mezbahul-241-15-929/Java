package Problem.Lab_Evulatioon_3;

public class Truck extends Vehicle{
    int loadCapacity;
    int axleCount;
    String type;

    public Truck(int vehicleNumber,String brand,int engineCapacity,int loadCapacity,int axleCount ,String type){
        super(vehicleNumber,brand,engineCapacity);
        this.loadCapacity=loadCapacity;
        this.axleCount=axleCount;
        this.type=type;
    }


    public void displayDetails(){
        System.out.println("--- Truck Details ---");
        System.out.println("Vehicle Number: C-"+vehicleNumber);
        System.out.println("Brand: "+brand);
        System.out.println("Engine Capacity: "+engineCapacity+"cc");
        System.out.println("Type: "+type);
        System.out.println("Load Capacity: "+loadCapacity+" tons");
        System.out.println("Axle Count:: "+axleCount+"\n");

    }
}