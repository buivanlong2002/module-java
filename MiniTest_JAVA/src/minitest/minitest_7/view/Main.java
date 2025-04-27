package minitest.minitest_7.view;
import minitest.minitest_7.controller.OrderManager;
import minitest.minitest_7.model.ClothingOrder;
import minitest.minitest_7.model.ElectronicsOrder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OrderManager manager = new OrderManager();
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("----- Order Management System -----");
            System.out.println("1. Add new order (Electronics / Clothing)");
            System.out.println("2. Remove order by ID");
            System.out.println("3. Display all orders");
            System.out.println("4. Display revenue report");
            System.out.println("5. Sort by order date");
            System.out.println("6. Sort by customer name");
            System.out.println("7. Sort by total price");
            System.out.println("8. View history");
            System.out.println("9. Save orders to file");
            System.out.println("10. Load orders from file");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter order type (1. Electronics, 2. Clothing): ");
                    int type = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Order ID: ");
                    String id = sc.nextLine();
                    System.out.print("Customer Name: ");
                    String name = sc.nextLine();
                    System.out.print("Order Date (yyyyMMdd): ");
                    int date = sc.nextInt();
                    sc.nextLine();

                    if (type == 1) {
                        System.out.print("Item Price: ");
                        double price = sc.nextDouble();
                        System.out.print("Warranty Months: ");
                        int months = sc.nextInt();
                        manager.addOrder(new ElectronicsOrder(id, name, date, price, months));
                    } else if (type == 2) {
                        System.out.print("Base Price: ");
                        double basePrice = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Size: ");
                        String size = sc.nextLine();
                        manager.addOrder(new ClothingOrder(id, name, date, basePrice, size));
                    }
                    break;
                case 2:
                    System.out.print("Enter order ID to remove: ");
                    String removeId = sc.nextLine();
                    manager.removeOrder(removeId);
                    break;
                case 3:
                    manager.displayAllOrders();
                    break;
                case 4:
                    manager.displayRevenueReport();
                    break;
                case 5:
                    manager.sortByOrderDate();
                    break;
                case 6:
                    manager.sortByCustomerName();
                    break;
                case 7:
                    manager.sortByTotalPrice();
                    break;
                case 8:
                    manager.printHistory();
                    break;
                case 9:
                    System.out.print("Enter filename to save: ");
                    String saveFile = sc.nextLine();
                    manager.saveToFile(saveFile);
                    break;
                case 10:
                    System.out.print("Enter filename to load: ");
                    String loadFile = sc.nextLine();
                    manager.loadFromFile(loadFile);
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        sc.close();
    }
}
