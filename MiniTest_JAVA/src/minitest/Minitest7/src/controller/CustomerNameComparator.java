package minitest.Minitest7.src.controller;


import minitest.Minitest7.src.model.Order;

public class CustomerNameComparator implements java.util.Comparator<Order>{
    @Override
    public int compare(Order o1, Order o2) { return o1.getCustomerName().compareToIgnoreCase(o2.getCustomerName()); }
}
