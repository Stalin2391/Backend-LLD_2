package LLD_2_SOLID.bad_v;

public class Client {
    public static void main(String[] args) {
        Bird b1 = new Bird();
        b1.type = "Sparrow";
        Bird b2 = new Bird();
        b2.type = "Pigeon";
        Bird b3 = new Bird();
        b3.type = "Penguin";

        b1.fly();
        b2.fly();
        b3.fly();

        // SOLID
        // S - Single Responsibilities Principles
        // O - Open/Close Principles
        // L - Liskov's Substitution Principles
        // I - Interface Segregation Principles
        // D - Dependency Inversion Principles


        // Question:
        // Design a soft system which stores the attributes and behaviours of diff Birds.


    }
}
