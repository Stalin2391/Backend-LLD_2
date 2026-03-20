package LLD_2_SOLID.designPatterns.singleton.v4;

public class Client {
    public static void main(String[] args) {
        DBConnection db = DBConnection.getInstance();
        DBConnection db1 = DBConnection.getInstance();

        System.out.println("DEBUG");
    }
}
