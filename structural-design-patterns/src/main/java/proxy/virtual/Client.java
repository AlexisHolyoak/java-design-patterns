package proxy.virtual;

import org.junit.Test;

public class Client {
    @Test
    public void OrderShouldPopulateItselfFullyOnCreation() {
        Order myOrder = new Order(1);
        ConsoleReporting.PrintOrderDetails(myOrder);
    }

    @Test
    public void OrderProxyShouldDeferObjectCreationUntilAccess() {
        OrderProxy myOrder = new OrderProxy(1);
        ConsoleReporting.PrintOrderDetails(myOrder);
        System.out.println("Again: " + myOrder.getCustomer().getName());
        for (OrderDetails item : myOrder.getItems()) {
            System.out.println("Item: " + item.getName());
        }
    }
}
