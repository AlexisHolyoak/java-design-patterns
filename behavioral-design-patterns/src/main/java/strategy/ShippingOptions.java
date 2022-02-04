package strategy;

public enum ShippingOptions {
    UPS(100), FedEx(200), USPS(300);

    private final int value;

    private ShippingOptions(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}