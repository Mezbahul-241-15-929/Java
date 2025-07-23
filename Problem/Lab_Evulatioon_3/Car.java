package Problem.Lab_Evulatioon_3;

public class Car extends Vehicle{
        int numberOfSeats;
    String fuelType;
    String type;

    public Car(int vehicleNumber,String brand,int engineCapacity,int numberOfSeats,String fuelType,String type){
        super(vehicleNumber,brand,engineCapacity);
        this.numberOfSeats=numberOfSeats;
        this.fuelType=fuelType;
        this.type=type;
    }

    public void displayDetails(){
        System.out.println("--- Car Details ---");
        System.out.println("Vehicle Number: C-"+vehicleNumber);
        System.out.println("Brand: "+brand);
        System.out.println("Engine Capacity: "+engineCapacity+"cc");
        System.out.println("Type: "+type);
        System.out.println("Number of Seats: "+numberOfSeats);
        System.out.println("Fuel Type: "+fuelType+"\n");
    }
}
