package LLD_2_SOLID.designPatterns.creational.prototype.v2;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> map = new HashMap<>();

    void registry(String key, Student student) {
        map.put(key, student);
    }

    Student get(String key) {
        return map.get(key);
    }
}
