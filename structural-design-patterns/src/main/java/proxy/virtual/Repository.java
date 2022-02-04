package proxy.virtual;

public abstract class Repository<T> {
    public abstract T getById(int id);
}