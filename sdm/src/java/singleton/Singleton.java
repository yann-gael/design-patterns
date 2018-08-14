package src.java.singleton;
import java.util.Random;
import static src.java.singleton.Utilities.*;
public class Singleton {
    int behaviour;
    private static final Singleton new_singleton = new Singleton();
    private Singleton()
    {
            Random rand = new Random();
            behaviour = rand.nextInt(50);
    }
    public static Singleton getInstance()
    {
        return new_singleton;
    }
}
