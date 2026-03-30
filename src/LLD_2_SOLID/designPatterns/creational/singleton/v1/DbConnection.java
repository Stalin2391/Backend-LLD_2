package LLD_2_SOLID.designPatterns.creational.singleton.v1;

public class DbConnection {
    private static DbConnection instance = null;

    private DbConnection() {

    }

    static DbConnection getInstance() {
        if(instance == null) instance = new DbConnection();
        return instance;
    }
}
