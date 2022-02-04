package singleton;

public class SingletonNotThreadSafe {
    private static SingletonNotThreadSafe instance = null;

    private SingletonNotThreadSafe() {
    }

    public void doSomething() {
        System.out.println(this.hashCode());
    }

    public static SingletonNotThreadSafe getInstance() {
        if (instance == null) {
            instance = new SingletonNotThreadSafe();
        }
        return instance;
    }
}
