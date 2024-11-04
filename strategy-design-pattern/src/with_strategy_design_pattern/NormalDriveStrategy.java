package with_strategy_design_pattern;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("NormalDriveStrategy drive() called");
    }
}
