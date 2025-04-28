package minitest.Minitest7.src.controller;

import minitest.Minitest7.src.model.ClothingOrder;
import minitest.Minitest7.src.model.ElectronicsOrder;
import minitest.Minitest7.src.model.FurnitureOrder;
import minitest.Minitest7.src.model.Order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.io.*;



public class OrderManager {
    private ArrayList<Order> orders = new ArrayList<>();
    private LinkedList<String> history = new LinkedList<>();

    public void addOrder(Order order) {
        orders.add(order);
        if (order instanceof ElectronicsOrder) {
            history.add("Added electronics order to order list");
        } else if (order instanceof ClothingOrder) {
            history.add("Added clothing order to order list");
        } else if (order instanceof FurnitureOrder) {
            history.add("Added furniture order to order list");
        } else {
            history.add("Added unknown type order to order list");
        }
        saveToFile("orders.dat", "history.dat");
    }

    public void removeOrder(String orderId) {
        boolean removed = orders.removeIf(order -> order.getOrderId().equals(orderId));
        if (removed) {
            System.out.println("Removed order by id: " + orderId);
            history.add("Removed order by id: " + orderId);
        } else {
            System.out.println("Order not found");
            history.add("Failed to remove order by id: " + orderId);
        }
        saveToFile("orders.dat", "history.dat");
    }

    public void displayAllOrders() {
        for (Order order : orders) {
            order.displayInfo();
        }
        history.add("Displayed all orders");
        saveToFile("orders.dat", "history.dat");
    }

    public void displayRevenueReport() {
        for (Order order : orders) {
            System.out.println("Order ID: " + order.getOrderId() + ", Total Price: " + order.calculateTotalPrice());
        }
        history.add("Displayed revenue report");
        saveToFile("orders.dat", "history.dat");
    }

    public void sortByOrderDate() {
        Collections.sort(orders);
        history.add("Sorted by order date");
        saveToFile("orders.dat", "history.dat");
    }

    public void sortByCustomerName() {
        orders.sort(new CustomerNameComparator());
        history.add("Sorted by customer name");
        saveToFile("orders.dat", "history.dat");
    }

    public void sortByTotalPrice() {
        orders.sort(new TotalPriceComparator());
        history.add("Sorted by total price");
        saveToFile("orders.dat", "history.dat");
    }

    public void printHistory() {
        System.out.println("----- History -----");
        for (String s : history) {
            System.out.println(s);
        }
    }

    public void saveToFile(String ordersFilename, String historyFilename) {
        try (ObjectOutputStream oosOrders = new ObjectOutputStream(new FileOutputStream(ordersFilename));
             ObjectOutputStream oosHistory = new ObjectOutputStream(new FileOutputStream(historyFilename))) {

            oosOrders.writeObject(orders);

            oosHistory.writeObject(history);

        } catch (IOException e) {
            System.out.println("Error saving orders and history: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public void loadFromFile(String ordersFilename, String historyFilename) {
        try (ObjectInputStream oisOrders = new ObjectInputStream(new FileInputStream(ordersFilename));
             ObjectInputStream oisHistory = new ObjectInputStream(new FileInputStream(historyFilename))) {

            orders = (ArrayList<Order>) oisOrders.readObject();
            history = (LinkedList<String>) oisHistory.readObject();

            System.out.println("Loaded orders from " + ordersFilename);
            System.out.println("Loaded history from " + historyFilename);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }

    public void displayRevenueInDateRange(int startDate, int endDate) {
        double totalRevenue = 0;
        System.out.println("\nRevenue report from " + startDate + " to " + endDate + ":");

        for (Order o : orders) {
            if (o.getOrderDate() >= startDate && o.getOrderDate() <= endDate) {
                System.out.println("Order ID: " + o.getOrderId() + ", Total Price: " + o.calculateTotalPrice());
                totalRevenue += o.calculateTotalPrice();
            }
        }
        System.out.println("Total Revenue in range: " + totalRevenue);
    }
}
