package minitest.minitest_7.model;

import java.io.Serializable;

public abstract class Order implements Payable, Comparable<Order>, Serializable {
    protected String orderId;
    protected String customerName;
    protected int orderDate; // format yyyyMMdd

    public Order(String orderId, String customerName, int orderDate) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderDate = orderDate;
    }

    public abstract void displayInfo();

    @Override
    public int compareTo(Order order) {
        return Integer.compare(this.orderDate, order.orderDate); // Tăng dần theo orderDate
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }
}
