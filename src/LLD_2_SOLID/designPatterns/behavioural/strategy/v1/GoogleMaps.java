package LLD_2_SOLID.designPatterns.behavioural.strategy.v1;

public class GoogleMaps {
    void findPathByMode(String source, String destination, TravelMode mode) {
        switch (mode) {
            case CAR:
                System.out.println("Car path calculated from " + source + " to " + destination);
                break;
            case BIKE:
                System.out.println("Bike path calculated from " + source + " to " + destination);
                break;
            case WALK:
                System.out.println("Walk path calculated from " + source + " to " + destination);
                break;
        }
    }
}
