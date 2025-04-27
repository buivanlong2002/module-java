package minitest.minitest_7.controller;

import minitest.minitest_7.model.CustomerNameComparator;
import minitest.minitest_7.model.Order;
import minitest.minitest_7.model.TotalPriceComparator;

import java.io.*;
import java.util.*;

public class OrderManager {
    private ArrayList<Order> orders = new ArrayList<>();
    private LinkedList<String> history = new LinkedList<>();

    public void addOrder(Order o) {
        orders.add(o);
        history.add("Added order: " + o.getOrderId());
    }

    public void removeOrder(String orderId) {
        orders.removeIf(o -> o.getOrderId().equals(orderId));
        history.add("Removed order: " + orderId);
    }

    public void displayAllOrders() {
        for (Order o : orders) {
            o.displayInfo();
        }
    }

    public void displayRevenueReport() {
        for (Order o : orders) {
            System.out.println("Order ID: " + o.getOrderId() + ", Total Price: " + o.calculateTotalPrice());
        }
    }

    public void sortByOrderDate() {
        Collections.sort(orders);
        history.add("Sorted by order date");
    }

    public void sortByCustomerName() {
        orders.sort(new CustomerNameComparator());
        history.add("Sorted by customer name");
    }

    public void sortByTotalPrice() {
        orders.sort(new TotalPriceComparator());
        history.add("Sorted by total price");
    }

    public void printHistory() {
        for (String h : history) {
            System.out.println(h);
        }
    }

    public void saveToFile(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(orders);
            System.out.println("Orders saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving orders: " + e.getMessage());
        }
    }

    public void loadFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            orders = (ArrayList<Order>) ois.readObject();
            System.out.println("Orders loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading orders: " + e.getMessage());
        }
    }
}
