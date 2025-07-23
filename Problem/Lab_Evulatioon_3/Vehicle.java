package Problem.Lab_Evulatioon_3;

public class Vehicle {
        int vehicleNumber;
    String brand;
    int engineCapacity;

    public Vehicle(int vehicleNumber,String brand,int engineCapacity){
        this.vehicleNumber=vehicleNumber;
        this.brand=brand;
        this.engineCapacity=engineCapacity;
    }

    public void displayDetails(){
        System.out.println("This is Vehicle");
    }
}
