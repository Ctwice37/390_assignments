package assignment_5.prog1;

public class MySingleton {
    private static MySingleton instance;
    public static int count = 0;

    private MySingleton() {
        count++;
    }
    public static MySingleton getInstance() {
        if(instance == null) {
            instance = new MySingleton();
        }
        return instance;
    }
}
