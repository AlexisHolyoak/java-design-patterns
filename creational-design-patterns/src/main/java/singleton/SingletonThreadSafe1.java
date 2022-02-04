package singleton;

public class SingletonThreadSafe1 {
    private static SingletonThreadSafe1 instance = null;

    private SingletonThreadSafe1() {
    }

    public void doSomething() {
        System.out.println(this.hashCode());
    }

    public static synchronized SingletonThreadSafe1 getInstance() {
        if (instance == null) {
            instance = new SingletonThreadSafe1();
        }
        return instance;
    }
}
