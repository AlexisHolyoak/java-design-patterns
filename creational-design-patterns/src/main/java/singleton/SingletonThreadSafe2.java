package singleton;

public class SingletonThreadSafe2 {
    private static SingletonThreadSafe2 instance = null;

    private SingletonThreadSafe2() {
    }

    public void doSomething() {
        System.out.println(this.hashCode());
    }

    public static SingletonThreadSafe2 getInstance() {
        if (instance != null) {
            return instance;
        }
        synchronized (SingletonThreadSafe2.class) {
            if (instance == null) {
                instance = new SingletonThreadSafe2();
            }
        }
        return instance;
    }
}
