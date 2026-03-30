package LLD_2_SOLID.designPatterns.creational.singleton.v3;

public class DbConnection {
    private static DbConnection instance = null;

    private DbConnection() {

    }

    public synchronized static DbConnection getInstance() {
        if(instance == null) {
            instance = new DbConnection();
        }
        return instance;
    }
}
