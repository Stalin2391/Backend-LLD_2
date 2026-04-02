package LLD_2_SOLID.designPatterns.behavioural.strategy.v0;

public class TrainPathCalculator implements PathCalculator {
    @Override
    public void calculatePath(String source, String destination) {
        System.out.println("Calculating train path from " + source + " to " + destination);
    }
}
