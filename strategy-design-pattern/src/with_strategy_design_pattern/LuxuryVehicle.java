package with_strategy_design_pattern;

public class LuxuryVehicle extends Vehicle {
    LuxuryVehicle() {
        super(new SportsDriveStrategy());
    }
}
