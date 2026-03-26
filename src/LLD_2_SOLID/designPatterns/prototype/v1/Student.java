package LLD_2_SOLID.designPatterns.prototype.v1;

public class Student implements Prototype<Student> {
    String name;
    int age;
    String batch;
    Double psp;
    Double avgPsp;


    Student(Student other) {
        this.name = other.name;
        this.age = other.age;
        this.batch = other.batch;
        this.psp = other.psp;
        this.avgPsp = other.avgPsp;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
