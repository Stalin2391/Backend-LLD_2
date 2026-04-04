package LLD_2_SOLID.designPatterns.behavioural.strategy.demo.v3;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPathByMode("Chennai", "Bangalore", TravelMode.WALK);
        googleMaps.findPathByMode("Coimbatore", "Bangalore", TravelMode.CAR);
    }
}
