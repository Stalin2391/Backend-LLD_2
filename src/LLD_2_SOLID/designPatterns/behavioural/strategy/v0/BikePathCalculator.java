package LLD_2_SOLID.designPatterns.behavioural.strategy.v0;

public class BikePathCalculator implements PathCalculator {
    @Override
    public void calculatePath(String source, String destination) {
        System.out.println("Bike path calculated from " + source + " to " + destination);
    }
}
