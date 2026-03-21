package LLD_2_SOLID.designPatterns.builder.v1;

public class Client {
    public static void main(String[] args) {
        Builder student = Student.getBuilder();
        student.setName("John Doe");
        student.setAge(20);
        student.setRollNo("12345");
        Student student1 = new Student(student);
    }
}
