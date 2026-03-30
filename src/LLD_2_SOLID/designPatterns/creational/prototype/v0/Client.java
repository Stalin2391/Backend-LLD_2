package LLD_2_SOLID.designPatterns.creational.prototype.v0;

public class Client {
    public static void main(String[] args) {
        IntelligentStundet is = new IntelligentStundet();
        is.iq = 140;
        IntelligentStundet is2 = is.copy();
        is2.iq = 150;

        System.out.println(is.iq);

        System.out.println("DEBUG");
    }
}
