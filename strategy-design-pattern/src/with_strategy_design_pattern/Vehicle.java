package with_strategy_design_pattern;

public class Vehicle {
    private DriveStrategy driveStrategy;
    Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }
    public void drive() {
        driveStrategy.drive();
    }
}
