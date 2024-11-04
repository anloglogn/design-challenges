package with_simple_inheritence;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inside main() method");

        Vehicle vehicle = new Vehicle();
        vehicle.drive();

        NormalVehicle normalVehicle = new NormalVehicle();
        normalVehicle.drive();

        SportsVehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();

        LuxuryVehicle luxuryVehicle = new LuxuryVehicle();
        luxuryVehicle.drive();

    }
}