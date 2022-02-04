package singleton;

public class SingletonNotThreadSafeTest {

    public static void main(String[] args) {
        SingletonNotThreadSafe instance = SingletonNotThreadSafe.getInstance();
        System.out.println(instance);

        SingletonNotThreadSafe anotherInstance = SingletonNotThreadSafe.getInstance();
        System.out.println(anotherInstance);

        if (instance == anotherInstance) {
            System.out.println("They are the same instance");
        }
    }
}
