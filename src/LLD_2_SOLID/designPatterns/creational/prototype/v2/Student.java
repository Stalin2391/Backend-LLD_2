package LLD_2_SOLID.designPatterns.creational.prototype.v2;

public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private String batch;
    private Double psp;
    private Double avgPsp;

    Student() {
    }

    Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.batch = student.batch;
        this.psp = student.psp;
        this.avgPsp = student.avgPsp;
    }

    @Override
    public Student clone() {
        //repetitive code
//        Student copy = new Student();
//        copy.name = this.name;
//        copy.age = this.age;
//        copy.batch = this.batch;
//        copy.psp = this.psp;
//        copy.avgPsp = this.avgPsp;
//        return copy;

        return new Student(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public Double getPsp() {
        return psp;
    }

    public void setPsp(Double psp) {
        this.psp = psp;
    }

    public Double getAvgPsp() {
        return avgPsp;
    }

    public void setAvgPsp(Double avgPsp) {
        this.avgPsp = avgPsp;
    }
}
