package LLD_2_SOLID.designPatterns.behavioural.strategy.v2;

public class TrainPathFinder implements PathFinder {
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Finding path from " + source + " to " + destination + " using Train");
    }
}
