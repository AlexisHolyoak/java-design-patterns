package proxy.virtual;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Order {
    protected int id;
    protected OrderEntity orderEntity;
    private Calendar orderDate;
    @SuppressWarnings("unused")
    private Customer customer;
    @SuppressWarnings("unused")
    private List<OrderDetails> items;

    public Order() {
    }

    public Order(int id) {
        this.id = id;
        getEntity();
        this.orderDate = this.orderEntity.getOrderDate();
        this.customer = getCustomer();
        this.items = getItems();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Calendar orderDate) {
        this.orderDate = orderDate;
    }

    public void setItems(List<OrderDetails> items) {
        this.items = items;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    protected void getEntity() {
        this.orderEntity = new OrderRepository().getById(id);
    }

    protected Customer getCustomer() {
        return new Customer(this.orderEntity.getCustomerId());
    }

    protected List<OrderDetails> getItems() {
        List<OrderDetails> items = new ArrayList<OrderDetails>();
        for (int orderDetailId : this.orderEntity.getOrderDetails()) {
            items.add(new OrderDetails(orderDetailId));
        }
        return items;
    }
}