package cachedrepository;

public abstract class Repository<T> {
    public abstract T getById(int id);
}