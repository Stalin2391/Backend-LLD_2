package LLD_2_SOLID.designPatterns.behavioural.strategy.v2;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPath("Location A", "Location B", TravelMode.CAR);
         googleMaps.findPath("Location A", "Location B", TravelMode.BIKE);
          googleMaps.findPath("Location A", "Location B", TravelMode.WALK);
    }
}
