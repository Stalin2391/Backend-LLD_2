package LLD_2_SOLID.designPatterns.behavioural.strategy.v2;

public class CarPathFinder implements PathFinder {
    @Override
    public void findPath(String from, String to) {
        System.out.println("Finding path for car from " + from + " to " + to);
    }
}
