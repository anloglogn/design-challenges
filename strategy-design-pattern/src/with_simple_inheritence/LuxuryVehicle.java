package with_simple_inheritence;

public class LuxuryVehicle extends Vehicle {
    @Override
    public void drive() {
        /* assuming luxury vehicle drive capability is same as sports vehicle drive capability, then code duplication */
        System.out.println("LuxuryVehicle drive() called");
    }
}
