package LLD_2_SOLID.designPatterns.singleton.v2;

public class DbConnection {
    // Eager / Earlier  initialization
    private static DbConnection instance = new DbConnection();

    private DbConnection() {

    }

    static DbConnection getInstance() {
        return instance;
    }
}
