package with_simple_inheritence;

public class SportsVehicle extends Vehicle {
    @Override
    public void drive() {
        /* assuming sports vehicle drive capability is same as luxury vehicle drive capability, then code duplication */
        System.out.println("SportsVehicle drive() called");
    }
}
