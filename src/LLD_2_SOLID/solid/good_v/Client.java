package LLD_2_SOLID.solid.good_v;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Bird> bird = new ArrayList<>();
        bird.add(new Sparrow());
        bird.add(new Penguin());

        for(int i = 0; i < bird.size(); i++){
            Bird b = bird.get(i);
            b.makeSound();
            b.eat();
        }
    }
}
