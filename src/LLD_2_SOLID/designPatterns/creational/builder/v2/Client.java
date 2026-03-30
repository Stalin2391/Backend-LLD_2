package LLD_2_SOLID.designPatterns.creational.builder.v2;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder()
                .setName("John Doe")
//                .setRollNo("12345")
//                .setCourse("Computer Science")
//                .setAge(20)
                .build();
        System.out.println("DEBUG");
    }
}
