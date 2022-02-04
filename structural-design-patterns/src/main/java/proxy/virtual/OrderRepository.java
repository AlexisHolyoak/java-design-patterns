package proxy.virtual;

import java.util.Calendar;

public class OrderRepository extends Repository<OrderEntity> {

    @Override
    public OrderEntity getById(int id) {
        System.out.println("--> Fetching Order " + id);
        return new OrderEntity(id, 1, new int[] { 1, 2, 3 }, Calendar.getInstance());
    }
}