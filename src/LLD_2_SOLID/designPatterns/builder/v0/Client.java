package LLD_2_SOLID.designPatterns.builder.v0;

public class Client {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setName("John Doe");
        builder.setAge(20);
        builder.setRollNo("12345");
        Student student = new Student(builder);
        System.out.println(student.age);
    }
}
