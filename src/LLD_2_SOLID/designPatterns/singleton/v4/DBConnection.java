package LLD_2_SOLID.designPatterns.singleton.v4;

public class DBConnection {
    private static DBConnection instance = null;

    private DBConnection() {

    }

    static DBConnection getInstance() {
        if(instance == null) {
            synchronized (DBConnection.class){
                if(instance == null) {
                    instance = new DBConnection();
                }
            }
        }
        return instance;
    }
}
