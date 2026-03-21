package LLD_2_SOLID.designPatterns.builder.v3;

public class Client {
    public static void main(String[] args) {
        Student st = Student.getBuilder()
                .setName("John Doe")
                .setAge(20)
                .setRollNo("12345")
                .build();

        System.out.println("DEBUG");
    }
}
