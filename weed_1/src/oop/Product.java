package oop;

import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private static String storeName = "Kho Tổng ABC";
    private static int totalProduct = 0;
    private static double totalInventoryValue = 0;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;

        totalProduct++;
        totalInventoryValue += getInventoryValue();
    }

    public void display() {
        System.out.println("ID: " + id +
                ", Tên: " + name +
                ", Giá: " + price +
                ", Số lượng: " + quantity +
                ", Kho: " + storeName +
                ", Giá trị tồn kho: " + getInventoryValue());
    }

    public double getInventoryValue() {
        return price * quantity;
    }

    public static double getAveragePrice() {
        return totalInventoryValue / totalProduct;
    }

    public static String getStoreName() {
        return storeName;
    }

    public static void setStoreName(String name) {
        storeName = name;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public static int getTotalProduct() {
        return totalProduct;
    }

    public static double getTotalInventoryValue() {
        return totalInventoryValue;
    }

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product(1, "Laptop", 25000000, 5);
        products[1] = new Product(2, "Điện thoại", 12000000, 10);
        products[2] = new Product(3, "Tai nghe", 500000, 20);
        products[3] = new Product(4, "Chuột", 300000, 15);
        products[4] = new Product(5, "Màn hình", 3500000, 7);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Hiển thị tất cả sản phẩm");
            System.out.println("2. Tìm sản phẩm theo tên");
            System.out.println("3. Hiển thị sản phẩm giá > 1 triệu");
            System.out.println("4. Hiển thị sản phẩm có số lượng nhiều nhất");
            System.out.println("5. Hiển thị tổng quan kho");
            System.out.println("6. Thay đổi tên kho");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    displayAllProducts(products);
                    break;
                case 2:
                    searchProductByName(products, scanner);
                    break;
                case 3:
                    displayProductsOverMillion(products);
                    break;
                case 4:
                    displayProductWithMaxQuantity(products);
                    break;
                case 5:
                    displaySummary();
                    break;
                case 6:
                    System.out.print("Nhập tên kho mới: ");
                    String newStoreName = scanner.nextLine();
                    Product.setStoreName(newStoreName);
                    System.out.println("Tên kho đã đổi thành: " + Product.getStoreName());
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        } while (choice != 0);

        scanner.close();
    }

    public static void displayAllProducts(Product[] products) {
        System.out.println("\n=== Danh sách sản phẩm ===");
        for (Product p : products) {
            p.display();
        }
    }

    public static void searchProductByName(Product[] products, Scanner scanner) {
        System.out.print("Nhập tên sản phẩm cần tìm: ");
        String searchName = scanner.nextLine();
        boolean found = false;

        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(searchName.trim())) {
                p.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sản phẩm.");
        }
    }

    public static void displayProductsOverMillion(Product[] products) {
        System.out.println("\n=== Sản phẩm có giá > 1.000.000 ===");
        for (Product p : products) {
            if (p.price > 1000000) {
                p.display();
            }
        }
    }

    public static void displayProductWithMaxQuantity(Product[] products) {
        Product max = products[0];
        for (Product p : products) {
            if (p.getQuantity() > max.getQuantity()) {
                max = p;
            }
        }
        System.out.println("\n=== Sản phẩm có số lượng lớn nhất ===");
        max.display();
    }

    public static void displaySummary() {
        System.out.println("\nTổng số sản phẩm: " + Product.getTotalProduct());
        System.out.println("Tổng giá trị tồn kho: " + Product.getTotalInventoryValue());
        System.out.println("Giá trung bình: " + Product.getAveragePrice());
        System.out.println("Tên kho: " + Product.getStoreName());
    }
}
