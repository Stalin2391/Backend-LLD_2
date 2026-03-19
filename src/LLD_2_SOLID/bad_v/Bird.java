package LLD_2_SOLID.bad_v;

public class Bird {
    String name;
    String color;
    int noOfWings;
    String type;

    void fly() {
        if(type == "Sparrow"){
            System.out.println("Flying Sparrow");
        }else if(type == "Pigeon"){
            System.out.println("Flying Pigeon");
        }else if(type == "Penguin"){
            System.out.println("Penguin can't fly");
        }
        else {
            System.out.println("Flying Bird");
        }
    }

    void eat(){
        System.out.println("eat");
    }

    void makeSound() {
        System.out.println("Unknown sound");
    }

    //Violating - Single responsibility principle - every class should have one responsibility
}
