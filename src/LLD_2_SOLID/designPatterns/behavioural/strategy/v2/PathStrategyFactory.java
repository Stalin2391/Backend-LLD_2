package LLD_2_SOLID.designPatterns.behavioural.strategy.v2;

public class PathStrategyFactory {
    public static PathFinder getPathFinder(TravelMode travelMode) {
        return switch (travelMode) {
            case CAR -> new CarPathFinder();
            case WALK -> new WalkPathFinder();
            case TRAIN -> new TrainPathFinder();
            case BIKE -> new BikePathFinder();
            default -> throw new IllegalArgumentException("Invalid travel mode: " + travelMode);
        };
    }
}
