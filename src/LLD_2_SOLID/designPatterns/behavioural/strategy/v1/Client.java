package LLD_2_SOLID.designPatterns.behavioural.strategy.v1;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPathByMode("Location A", "Location B", TravelMode.CAR);
    }
}
