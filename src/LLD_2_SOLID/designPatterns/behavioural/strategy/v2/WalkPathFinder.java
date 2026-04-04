package LLD_2_SOLID.designPatterns.behavioural.strategy.v2;

public class WalkPathFinder implements PathFinder {
    @Override
    public void findPath(String from, String to) {
        System.out.println("Finding walk path from " + from + " to " + to);
    }
}
