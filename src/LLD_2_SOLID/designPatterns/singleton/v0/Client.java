package LLD_2_SOLID.designPatterns.singleton.v0;

public class Client {
    public static void main(String[] args) {
        DbConnection db = DbConnection.getInstance("db");
        DbConnection db1 = DbConnection.getInstance("db1");

        System.out.println("DEBUG");
    }
}
