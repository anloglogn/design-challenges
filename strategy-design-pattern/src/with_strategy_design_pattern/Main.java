package with_strategy_design_pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inside main() method");

        Vehicle normalVehilce = new NormalVehicle();
        normalVehilce.drive();

        Vehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();

        Vehicle luxuryVehicle = new LuxuryVehicle();
        luxuryVehicle.drive();
    }
}