package proxy.virtual;

public class OrderDetailsRepository extends Repository<OrderDetailsEntity> {

    @Override
    public OrderDetailsEntity getById(int id) {
        System.out.println("--> Fetching Order Details Item " + id);
        return new OrderDetailsEntity(id, "Product " + id, id * 1.23);
    }
}