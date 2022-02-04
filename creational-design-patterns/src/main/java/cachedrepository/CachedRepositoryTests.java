package cachedrepository;

//import org.junit.Test;

public class CachedRepositoryTests {
    //@Test
    public void CachedOrderRepositoryShouldLoadOrderFromSourceOnlyOnce() {
        CachedOrderRepository orderEntity1 = new CachedOrderRepository();
        CachedOrderRepository orderEntity2 = new CachedOrderRepository();
        CachedOrderRepository orderEntity3 = new CachedOrderRepository();
        orderEntity1.getById(1);
        orderEntity2.getById(1);
        orderEntity3.getById(1);
    }
}
