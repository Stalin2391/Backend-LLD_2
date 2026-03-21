package LLD_2_SOLID.designPatterns.builder.v2;

public class Student {
    String name;
    String rollNo;
    int age;
    String batch;
    Double psp;
    String course;

    Student(Builder builder){
        this.name = builder.name;
        this.rollNo = builder.rollNo;
        this.age = builder.age;
        this.batch = builder.batch;
        this.psp = builder.psp;
        this.course = builder.course;
    }

    static Builder getBuilder() {
        return new Builder();
    }
}
