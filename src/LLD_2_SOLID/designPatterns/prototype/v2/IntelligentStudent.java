package LLD_2_SOLID.designPatterns.prototype.v2;

public class IntelligentStudent extends Student {
    private int iq;
    private int iqScore;

    IntelligentStudent() {
    }

    IntelligentStudent(IntelligentStudent intelligentStudent) {
        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
        this.iqScore = intelligentStudent.iqScore;
    }

    @Override
    public Student clone() {
        return new IntelligentStudent(this);
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public int getIqScore() {
        return iqScore;
    }

    public void setIqScore(int iqScore) {
        this.iqScore = iqScore;
    }
}
