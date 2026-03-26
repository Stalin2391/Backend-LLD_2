package LLD_2_SOLID.designPatterns.prototype.v0;

public class Student {
    private String name;
    private int age;
    private String batch;
    private Double psp;

    public Student(){

    }
    public Student(Student other) {
        this.name = other.name;
        this.age = other.age;
        this.batch = other.batch;
        this.psp = other.psp;
    }
    Student copy(){
        return new Student(this);
    }

}
