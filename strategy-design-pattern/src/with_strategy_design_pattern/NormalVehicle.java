package with_strategy_design_pattern;

public class NormalVehicle extends Vehicle {
    NormalVehicle() {
        super(new NormalDriveStrategy());
    }
}
