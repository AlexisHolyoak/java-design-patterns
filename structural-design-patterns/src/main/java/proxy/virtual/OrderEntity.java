package proxy.virtual;

import java.util.Calendar;

public class OrderEntity {
    private int id;
    private int customerId;
    private int[] orderDetails;
    private Calendar orderDate;

    public OrderEntity(int id, int customerId, int[] orderDetails, Calendar orderDate) {
        this.id = id;
        this.customerId = customerId;
        this.orderDetails = orderDetails;
        this.orderDate = orderDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int[] getOrderDetails() {
        return this.orderDetails;
    }

    public void setOrderDetails(int[] orderDetails) {
        this.orderDetails = orderDetails;
    }

    public Calendar getOrderDate() {
        return this.orderDate;
    }

    public void setOrderDate(Calendar orderDate) {
        this.orderDate = orderDate;
    }
}