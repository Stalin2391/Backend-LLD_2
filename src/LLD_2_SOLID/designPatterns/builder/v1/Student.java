package LLD_2_SOLID.designPatterns.builder.v1;

public class Student {
    String name;
    String rollNo;
    int age;
    String course;
    Double psp;
    String batch;

    Student(Builder builder) {

        if(builder.name == null || builder.rollNo == null) {
            throw new IllegalArgumentException("Name and Roll No cannot be null");
        } else if(builder.age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.name = builder.name;
        this.rollNo = builder.rollNo;
        this.age = builder.age;
        this.course = builder.course;
        this.psp = builder.psp;
        this.batch = builder.batch;
    }

    static Builder getBuilder() {
        return new Builder();
    }
}
