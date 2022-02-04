package cachedrepository;

public class CachedOrderRepository extends OrderRepository {
    public OrderEntity getById(int id) {
        String cacheKey = "OrderEntity-" + id;
        OrderEntity entity = (OrderEntity) Cache.get(cacheKey);
        if (entity == null) {
            entity = super.getById(id);
            Cache.put(cacheKey, entity);
        }
        return entity;
    }
}
