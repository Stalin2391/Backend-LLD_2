package LLD_2_SOLID.designPatterns.singleton.v0;

public class DbConnection {
     String name;

    private DbConnection(String name) {
        this.name = name;
    }
    static DbConnection getInstance(String name){
        return new DbConnection(name);
    }
}
