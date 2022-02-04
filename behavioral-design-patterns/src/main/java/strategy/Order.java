package strategy;

public class Order {
    private ShippingOptions shippingMethod;
    private Address destination;
    private Address origin;

    public Order(ShippingOptions shippingMethod, Address destination, Address origin) {
        this.shippingMethod = shippingMethod;
        this.destination = destination;
        this.origin = origin;
    }

    public ShippingOptions getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(ShippingOptions shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public Address getDestination() {
        return destination;
    }

    public void setDestination(Address destination) {
        this.destination = destination;
    }

    public Address getOrigin() {
        return origin;
    }

    public void setOrigin(Address origin) {
        this.origin = origin;
    }
}