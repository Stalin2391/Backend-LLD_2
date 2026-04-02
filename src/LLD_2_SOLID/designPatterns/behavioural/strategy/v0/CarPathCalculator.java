package LLD_2_SOLID.designPatterns.behavioural.strategy.v0;

public class CarPathCalculator implements PathCalculator{
    @Override
    public void calculatePath(String source, String destination) {
        System.out.println("Car path calculated from " + source + " to " + destination);
    }
}
