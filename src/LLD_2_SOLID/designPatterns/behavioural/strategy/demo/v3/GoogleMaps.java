package LLD_2_SOLID.designPatterns.behavioural.strategy.demo.v3;

public class GoogleMaps {
    public void findPathByMode(String source, String destination, TravelMode mode){
        PathStrategy pathStrategy = PathStratedyFactory.getPathStrategy(mode);
        pathStrategy.findPath(source, destination);
    }
}
