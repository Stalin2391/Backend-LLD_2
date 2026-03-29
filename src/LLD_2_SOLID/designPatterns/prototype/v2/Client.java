package LLD_2_SOLID.designPatterns.prototype.v2;

public class Client {

    public static void fillRegister(StudentRegistry studentRegistry){
        Student student = new Student();
        student.setAvgPsp(90.0);
        student.setBatch("2024");
        studentRegistry.registry("student1", student);

        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.setIq(150);
        intelligentStudent.setIqScore(99);
        intelligentStudent.setAvgPsp(95.0);

        studentRegistry.registry("intelligentStudent1", intelligentStudent);

    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegister(studentRegistry);

        Student st = studentRegistry.get("student1").clone();
        st.setName("John");
        st.setAge(20);
        st.setPsp(95.0);


        Student ist = studentRegistry.get("intelligentStudent1").clone();

        ist.setName("Jane");
        ist.setAge(22);
        ist.setPsp(98.0);


        System.out.println("DEBUG");

    }
}
