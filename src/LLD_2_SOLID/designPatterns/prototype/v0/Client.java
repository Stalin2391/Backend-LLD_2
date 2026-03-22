package LLD_2_SOLID.designPatterns.prototype.v0;

public class Client {
    public static void main(String[] args) {
        Student st = new Student("John Doe", 20, "Batch A", 85.5);
        st.setName("test");
        Student studentCopy = new Student(st);

        System.out.println("DEBUG");
    }
}
