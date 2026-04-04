package LLD_2_SOLID.designPatterns.behavioural.strategy.demo.v3;

public class PathStratedyFactory {
    public static PathStrategy getPathStrategy(TravelMode travelMode) {
        switch (travelMode) {
            case WALK:
                return new WalkPathFinder();
            case CAR:
                return new CarPathFinder();
            default:
                throw new IllegalArgumentException("Invalid travel mode: " + travelMode);
        }
    }
}
