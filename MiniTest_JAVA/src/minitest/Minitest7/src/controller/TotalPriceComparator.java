package minitest.Minitest7.src.controller;


import minitest.Minitest7.src.model.Order;

public class TotalPriceComparator implements java.util.Comparator<Order>{
    @Override
    public int compare(Order o1, Order o2) {
        return Double.compare(o1.calculateTotalPrice(), o2.calculateTotalPrice());
    }
}
