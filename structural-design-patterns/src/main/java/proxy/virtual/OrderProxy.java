package proxy.virtual;

import java.util.Calendar;
import java.util.List;

public class OrderProxy extends Order {
    private boolean customerLoaded;
    private boolean entityLoaded;
    private boolean itemsLoaded;
    private Customer customer;
    private List<OrderDetails> orderDetails;

    public OrderProxy() {
    }

    public OrderProxy(int id) {
        this.id = id;
    }

    public Calendar getOrderDate() {
        getEntity();
        return orderEntity.getOrderDate();
    }

    protected void getEntity() {
        if (!entityLoaded) {
            super.getEntity();
            entityLoaded = true;
        }
    }

    protected Customer getCustomer() {
        if (!customerLoaded) {
            getEntity();
            customer = super.getCustomer();
            customerLoaded = true;
        }
        return customer;
    }

    protected List<OrderDetails> getItems() {
        if (!itemsLoaded) {
            getEntity();
            orderDetails = super.getItems();
            itemsLoaded = true;
        }
        return orderDetails;
    }
}
