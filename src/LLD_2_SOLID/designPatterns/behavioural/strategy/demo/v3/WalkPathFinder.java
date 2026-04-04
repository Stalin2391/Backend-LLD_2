package LLD_2_SOLID.designPatterns.behavioural.strategy.demo.v3;

public class WalkPathFinder implements PathStrategy{

    public void findPath(String source, String destination) {
        System.out.println("Finding path from " + source + " to " + destination + " by walking");
    }
}
