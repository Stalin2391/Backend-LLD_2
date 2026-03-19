package LLD_2_SOLID.good_v;

public class Sparrow extends Bird implements Flyable, Dancing{
    @Override
    void makeSound() {
        System.out.println("Sparrow make sound");
    }

    @Override
    void eat() {
        System.out.println("Sparrow - eating");
    }

    @Override
    public void fly() {
        System.out.println("Flying Sparrow");
    }

    @Override
    public void dancing() {
        System.out.println("Dancing sparrow");
    }
}
