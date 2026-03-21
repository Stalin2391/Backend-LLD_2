package LLD_2_SOLID.designPatterns.builder.v0;

public class Builder {
    String name;
    String rollNo;
    int age;
    String course;
    Double psp;
    String batch;

    void setName(String name) {
        this.name = name;
    }
    void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    void setAge(int age) {
        this.age = age;
    }
    void setCourse(String course) {
        this.course = course;
    }
    void setPsp(Double psp) {
        this.psp = psp;
    }
    void setBatch(String batch) {
        this.batch = batch;
    }
}
