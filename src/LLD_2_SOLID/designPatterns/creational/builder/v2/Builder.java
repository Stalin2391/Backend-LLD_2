package LLD_2_SOLID.designPatterns.creational.builder.v2;

public class Builder {
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
    Builder setBatch(String batch){
        this.batch = batch;
        return this;
    }
    Builder setPsp(Double psp){
        this.psp = psp;
        return this;
    }
    Builder setCourse(String course){
        this.course = course;
        return this;
    }

    public Student build(){
        return new Student(this);
    }
}
