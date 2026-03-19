package LLD_2_SOLID.good_v;

public class Penguin extends Bird implements Dancing{
    @Override
    void makeSound() {
        System.out.println("Penguin - make sound");
    }

    @Override
    void eat() {
        System.out.println("Penguin eating");
    }

    @Override
    public void dancing() {
        System.out.println("Dancing Penguin");
    }
}
