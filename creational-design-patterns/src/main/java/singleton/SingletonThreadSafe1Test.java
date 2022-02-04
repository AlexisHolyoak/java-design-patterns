package singleton;

public class SingletonThreadSafe1Test {

    public static void main(String[] args) {
        SingletonThreadSafe1 instance = SingletonThreadSafe1.getInstance();
        System.out.println(instance);

        SingletonThreadSafe1 anotherInstance = SingletonThreadSafe1.getInstance();
        System.out.println(anotherInstance);

        if (instance == anotherInstance) {
            System.out.println("They are the same instance");
        }
    }
}
