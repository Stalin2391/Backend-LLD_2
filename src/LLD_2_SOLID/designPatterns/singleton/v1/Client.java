package LLD_2_SOLID.designPatterns.singleton.v1;


public class Client {
    public static void main(String[] args) {
        DbConnection db = DbConnection.getInstance();
        DbConnection db1 = DbConnection.getInstance();

        System.out.println("DEBUG");
    }
}
