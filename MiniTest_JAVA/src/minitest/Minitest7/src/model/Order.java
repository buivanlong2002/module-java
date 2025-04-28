package minitest.Minitest7.src.model;

import java.io.Serializable;

public abstract class Order implements Payable, Comparable<Order>, Serializable {
    private final String orderId;
    private final String customerName;
    private final int orderDate;


    public Order(String orderId, String customerName, int orderDate) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderDate = orderDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getOrderDate() {
        return orderDate;
    }

    public abstract void displayInfo();

    public int compareTo(Order o) {
        return Integer.compare(this.orderDate, o.orderDate);
    }
}
