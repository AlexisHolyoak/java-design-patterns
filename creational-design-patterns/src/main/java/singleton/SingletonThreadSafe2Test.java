package singleton;

public class SingletonThreadSafe2Test {

    public static void main(String[] args) {
        SingletonThreadSafe2 instance = SingletonThreadSafe2.getInstance();
        System.out.println(instance);

        SingletonThreadSafe2 anotherInstance = SingletonThreadSafe2.getInstance();
        System.out.println(anotherInstance);

        if (instance == anotherInstance) {
            System.out.println("They are the same instance");
        }
    }
}
