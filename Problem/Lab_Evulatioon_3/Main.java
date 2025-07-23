package Problem.Lab_Evulatioon_3;

public class Main {
        public static void main(String[] args) {
        Car c1 = new Car(1234, "Toyata", 1500, 5, "Patrol", "Car");
        Bike c2 = new Bike(5678, "Yamaha", 150, "With Carrier", "Bike");
        Truck c3 = new Truck(9012, "Tata", 500, 10, 6, "Truck");

        c1.displayDetails();
        c2.displayDetails();
        c3.displayDetails();

    }
}
