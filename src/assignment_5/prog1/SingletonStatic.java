package assignment_5.prog1;

public class SingletonStatic {
    public static final SingletonStatic INSTANCE
            = new SingletonStatic();

    private SingletonStatic() {
        System.out.println("Created without Being Called");
    }

    public static void main(String[] args) {

    }
}

