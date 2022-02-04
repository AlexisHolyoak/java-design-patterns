package proxy.virtual;

import java.text.SimpleDateFormat;

public class ConsoleReporting {
    public static void PrintOrderDetails(Order order) {
        System.out.println("Displaying Order Information:");
        System.out.println("Order Date: " + new SimpleDateFormat("yyyy-MM-dd").format(order.getOrderDate().getTime()));
        System.out.println("Customer: " + order.getCustomer().getName());
    }
}