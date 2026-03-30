package LLD_2_SOLID.designPatterns.creational.prototype.v0;

public class IntelligentStundet extends Student {
    int iq;

    public IntelligentStundet() {
        super();
    }
    public IntelligentStundet(IntelligentStundet other) {
        super(other);
        this.iq = other.iq;
    }
    public IntelligentStundet copy() {
        return new IntelligentStundet(this);
    }
}
