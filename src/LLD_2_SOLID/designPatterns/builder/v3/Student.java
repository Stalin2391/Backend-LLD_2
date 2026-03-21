package LLD_2_SOLID.designPatterns.builder.v3;

public class Student {
    String name;
    String rollNo;
    int age;
    String batch;
    Double psp;
    String course;

    private Student(Builder builder) {
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


    public static class Builder {
        String name;
        String rollNo;
        int age;
        String batch;
        Double psp;
        String course;

        Builder setName(String name) {
            this.name = name;
            return this;
        }
        Builder setRollNo(String rollNo) {
            this.rollNo = rollNo;
            return this;
        }
        Builder setAge(int age){
            this.age = age;
            return this;
        }
        Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }
        Builder setPsp(Double psp) {
            this.psp = psp;
            return this;
        }
        Builder setCourse(String course) {
            this.course = course;
            return this;
        }
        Student build() {
            if(this.name == null || this.rollNo == null) {
                throw new IllegalArgumentException("Name and Roll No cannot be null");
            } else if(this.age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }
            return  new Student(this);
        }
    }
}
