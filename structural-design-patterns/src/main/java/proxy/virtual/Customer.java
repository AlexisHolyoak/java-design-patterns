package proxy.virtual;

import java.util.List;

public class Customer {
    private int id;
    private String name;
    private List<Order> orders;

    public Customer() {

    }

    public Customer(int id) {
        this.id = id;
        CustomerEntity customerEntity = new CustomerRepository().getById(id);
        this.name = customerEntity.getName();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}