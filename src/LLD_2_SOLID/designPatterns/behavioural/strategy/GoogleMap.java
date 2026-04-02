package LLD_2_SOLID.designPatterns.behavioural.strategy;

public class GoogleMap {
    PathCalculator pathCalculator;
    public void findPath(String source, String destination, String mode) {
        if (mode.equals("car")) {
           pathCalculator = new CarPathCalculator();
        } else if (mode.equals("bike")) {
            pathCalculator = new BikePathCalculator();
        } else if (mode.equals("walk")) {
            pathCalculator = new WalkPathCalculator();
        } else if (mode.equals("train")) {
            pathCalculator = new TrainPathCalculator();
        } else {
            System.out.println("Invalid mode of transportation");
            return;
        }
        pathCalculator.calculatePath(source, destination);
    }
}
