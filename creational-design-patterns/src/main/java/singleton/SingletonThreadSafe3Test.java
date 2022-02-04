package singleton;

public class SingletonThreadSafe3Test {

    public static void main(String[] args) {
        SingletonThreadSafe3.INSTANCE.doSomething();
        SingletonThreadSafe3.INSTANCE.doSomething();
    }
}
