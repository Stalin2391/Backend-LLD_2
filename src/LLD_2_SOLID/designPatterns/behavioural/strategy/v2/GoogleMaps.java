package LLD_2_SOLID.designPatterns.behavioural.strategy.v2;

public class GoogleMaps {
    void findPath(String from, String to, TravelMode mode) {
       PathFinder pathFinder = PathStrategyFactory.getPathFinder(mode);
       pathFinder.findPath(from, to);
    }
}
