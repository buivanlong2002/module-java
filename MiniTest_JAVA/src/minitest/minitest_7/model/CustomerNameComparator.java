package minitest.minitest_7.model;

import java.util.Comparator;

public class CustomerNameComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return o1.getCustomerName().compareToIgnoreCase(o2.getCustomerName());
    }
}

 public class TotalPriceComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return Double.compare(o1.calculateTotalPrice(), o2.calculateTotalPrice());
    }
}
