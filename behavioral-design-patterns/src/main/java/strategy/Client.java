package strategy;

import static org.junit.Assert.*;

import org.junit.Test;

public class Client {

    @Test
    public void when_shipping_via_UPS_The_shipping_cost_is_425() throws UnknownOrderShippingMethodException {
        ShippingCostStrategy strategy = new UPSShippingCostStrategy();
        ShippingCostCalculatorService shippingCalculatorService = new ShippingCostCalculatorService(strategy);
        Order order = createOrder_UPS();
        double cost = shippingCalculatorService.calculateShippingCost(order);
        assertEquals(4.25, cost, 0);
    }

    @Test
    public void when_shipping_via_USPS_The_shipping_cost_is_300() throws UnknownOrderShippingMethodException {
        ShippingCostStrategy strategy = new USPSShippingCostStrategy();
        ShippingCostCalculatorService shippingCalculatorService = new ShippingCostCalculatorService(strategy);
        Order order = createOrder_USPS();
        double cost = shippingCalculatorService.calculateShippingCost(order);
        assertEquals(3.00, cost, 0);
    }

    @Test
    public void when_shipping_via_FedEx_The_shipping_cost_is_5() throws UnknownOrderShippingMethodException {
        ShippingCostStrategy strategy = new FedExShippingCostStrategy();
        ShippingCostCalculatorService shippingCalculatorService = new ShippingCostCalculatorService(strategy);
        Order order = createOrder_FedEx();
        double cost = shippingCalculatorService.calculateShippingCost(order);
        assertEquals(5.00, cost, 0);
    }

    public static Order createOrder_UPS() {
        return new Order(ShippingOptions.UPS, createAddress_Destination(), createAddress_Origin());
    }

    public static Order createOrder_FedEx() {
        return new Order(ShippingOptions.FedEx, createAddress_Destination(), createAddress_Origin());
    }

    public static Order createOrder_USPS() {
        return new Order(ShippingOptions.USPS, createAddress_Destination(), createAddress_Origin());
    }

    public static Address createAddress_Origin() {
        Address address = new Address();
        address.setContactName("David Starr");
        address.setAddressLine1("185 Lincoln St.");
        address.setAddressLine2("Suite 305");
        address.setAddressLine3(null);
        address.setCity("Hingham");
        address.setCountry("U.S.");
        address.setRegion("MA");
        address.setPostalCode("02043-1741");
        return address;
    }

    public static Address createAddress_Destination() {
        Address address = new Address();
        address.setContactName("Homer Simpson");
        address.setAddressLine1("123 Elm");
        address.setAddressLine2(null);
        address.setAddressLine3(null);
        address.setCity("Springfield");
        address.setCountry("U.S.");
        address.setRegion("Iowa");
        address.setPostalCode("11111");
        return address;
    }
}