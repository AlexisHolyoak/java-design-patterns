package proxy.virtual;

public class OrderDetails {
    private int id;
    private String name;
    private double price;

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public OrderDetails() {

    }

    public OrderDetails(int id) {
        this.id = id;
        OrderDetailsEntity orderDetailsEntity = new OrderDetailsRepository().getById(id);
        this.name = orderDetailsEntity.getName();
        this.price = orderDetailsEntity.getPrice();
    }
}
