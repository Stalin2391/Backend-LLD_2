package LLD_2_SOLID.designPatterns.behavioural.strategy;

public class Client {
    public static void main(String[] args) {
        GoogleMap googleMap = new GoogleMap();
        googleMap.findPath("Location A", "Location B", "car");
        System.out.println("Debug");
    }
}
