package singleton;

public enum SingletonThreadSafe3 {
    INSTANCE;

    public void doSomething() {
        System.out.println(this.hashCode());
    }
}
