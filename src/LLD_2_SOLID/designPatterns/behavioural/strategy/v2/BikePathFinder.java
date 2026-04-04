package LLD_2_SOLID.designPatterns.behavioural.strategy.v2;

public class BikePathFinder implements PathFinder {
    @Override
    public void findPath(String from, String to) {
        System.out.println("Finding bike path from " + from + " to " + to);
    }
}
