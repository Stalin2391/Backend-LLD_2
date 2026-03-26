package LLD_2_SOLID.designPatterns.prototype.v1;

public class IntelligentStudent extends Student {
    int iq;

    IntelligentStudent(IntelligentStudent other) {
        super(other);
        this.iq = other.iq;
    }

    @Override
    public Student clone() {
        return new IntelligentStudent(this);
    }
}
