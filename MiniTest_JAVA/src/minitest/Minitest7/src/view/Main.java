package minitest.Minitest7.src.view;


import minitest.Minitest7.src.controller.OrderManager;
import minitest.Minitest7.src.model.ClothingOrder;
import minitest.Minitest7.src.model.ElectronicsOrder;
import minitest.Minitest7.src.model.FurnitureOrder;
import minitest.Minitest7.src.model.Size;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrderManager orderManager = new OrderManager();
        orderManager.addOrder(new ElectronicsOrder("TV123", "Tran Huy Hoang", 20250420, 12000.99, 24));
        orderManager.addOrder(new ElectronicsOrder("LP456", "Marco Reus", 20250418, 3500.50, 36));
        orderManager.addOrder(new ClothingOrder("CLO123", "Jude Bellingham", 20250422, 25.99, Size.L));
        orderManager.addOrder(new ClothingOrder("CLO456", "Cristiano Ronaldo", 20250423, 50.75, Size.S));

        int choice;
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Add New Order (Electronics / Clothing / Furniture)");
            System.out.println("2. Delete order by order id");
            System.out.println("3. Show all orders");
            System.out.println("4. Show revenue report");
            System.out.println("5. Sort by order date");
            System.out.println("6. Sort by customer name");
            System.out.println("7. Sort by total order amount");
            System.out.println("8. View operation history");
            System.out.println("9. Save order list to binary file");
            System.out.println("10. Read order list from binary file");
            System.out.println("11. Display revenue in date range");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addNewOrder(orderManager, sc);
                    break;

                case 2:
                    removeOrder(orderManager, sc);
                    break;

                case 3:
                    orderManager.displayAllOrders();
                    break;

                case 4:
                    orderManager.displayRevenueReport();
                    break;

                case 5:
                    orderManager.sortByOrderDate();
                    System.out.println("Sorted by order date.");
                    orderManager.displayAllOrders();
                    break;

                case 6:
                    orderManager.sortByCustomerName();
                    System.out.println("Sorted by customer name.");
                    orderManager.displayAllOrders();
                    break;

                case 7:
                    orderManager.sortByTotalPrice();
                    System.out.println("Sorted by total price.");
                    orderManager.displayAllOrders();
                    break;

                case 8:
                    orderManager.printHistory();
                    break;

                case 9:
                    saveOrdersToFile(orderManager, sc);
                    break;

                case 10:
                    loadOrdersFromFile(orderManager, sc);
                    break;

                case 11:
                    displayRevenueInDateRange(orderManager, sc);
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        sc.close();
    }

    private static void addNewOrder(OrderManager orderManager, Scanner sc) {
        System.out.print("Order type (1-Electronics, 2-Clothing, 3-Furniture): ");
        int type = Integer.parseInt(sc.nextLine());
        System.out.print("Order ID: ");
        String id = sc.nextLine();
        System.out.print("Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Order Date (yyyyMMdd): ");
        int date = Integer.parseInt(sc.nextLine());

        if (type == 1) {
            addElectronicsOrder(orderManager, sc, id, name, date);
        } else if (type == 2) {
            addClothingOrder(orderManager, sc, id, name, date);
        } else if (type == 3) {
            addFurnitureOrder(orderManager, sc, id, name, date);
        }
    }

    private static void addElectronicsOrder(OrderManager orderManager, Scanner sc, String id, String name, int date) {
        System.out.print("Item Price: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("Warranty Months: ");
        int months = Integer.parseInt(sc.nextLine());
        orderManager.addOrder(new ElectronicsOrder(id, name, date, price, months));
    }

    private static void addClothingOrder(OrderManager orderManager, Scanner sc, String id, String name, int date) {
        System.out.print("Base Price: ");
        double basePrice = Double.parseDouble(sc.nextLine());
        System.out.print("Size (XS, S, M, L, XL, XXL): ");
        String sizeStr = sc.nextLine();
        Size size = Size.valueOf(sizeStr);
        orderManager.addOrder(new ClothingOrder(id, name, date, basePrice, size));
    }

    private static void addFurnitureOrder(OrderManager orderManager, Scanner sc, String id, String name, int date) {
        System.out.print("Base Price: ");
        double basePrice = Double.parseDouble(sc.nextLine());
        orderManager.addOrder(new FurnitureOrder(id, name, date, basePrice));
    }

    private static void removeOrder(OrderManager orderManager, Scanner sc) {
        System.out.print("Enter order ID to remove: ");
        String removeId = sc.nextLine();
        orderManager.removeOrder(removeId);
    }

    private static void saveOrdersToFile(OrderManager orderManager, Scanner sc) {
        System.out.print("Enter orders filename to save: ");
        String ordersSaveFile = sc.nextLine();
        System.out.print("Enter history filename to save: ");
        String historySaveFile = sc.nextLine();
        orderManager.saveToFile(ordersSaveFile, historySaveFile);
    }

    private static void loadOrdersFromFile(OrderManager orderManager, Scanner sc) {
        System.out.print("Enter orders filename to load: ");
        String ordersLoadFile = sc.nextLine();
        System.out.print("Enter history filename to load: ");
        String historyLoadFile = sc.nextLine();
        orderManager.loadFromFile(ordersLoadFile, historyLoadFile);
    }

    private static void displayRevenueInDateRange(OrderManager orderManager, Scanner sc) {
        System.out.print("Enter start date (yyyyMMdd): ");
        int start = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter end date (yyyyMMdd): ");
        int end = sc.nextInt();
        orderManager.displayRevenueInDateRange(start, end);
    }
}
