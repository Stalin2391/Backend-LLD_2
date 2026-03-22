package LLD_2_SOLID.designPatterns.prototype.v0;

public class Student {
    private String name;
    private int age;
    private String batch;
    private Double psp;
    Student(String name, int age, String batch, Double psp){
        this.name = name;
        this.age = age;
        this.batch = batch;
        this.psp = psp;

    }
    Student(Student other){
        this.name = other.name;
        this.age = other.age;
        this.batch = other.batch;
        this.psp = other.psp;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
