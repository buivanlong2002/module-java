package collection_framework.bt_1;

import java.util.*;

public class ProductManager {
    private List<Product> productList = new ArrayList<>();

    // Thêm sản phẩm
    public void addProduct(Product product) {
        productList.add(product);
    }

    // Sửa sản phẩm theo id
    public void updateProduct(String id, String newName, double newPrice) {
        for (Product p : productList) {
            if (p.getId().equals(id)) {
                p.setName(newName);
                p.setPrice(newPrice);
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm có ID: " + id);
    }

    // Xoá sản phẩm theo id
    public void deleteProduct(String id) {
        productList.removeIf(p -> p.getId().equals(id));
    }

    // Hiển thị danh sách sản phẩm
    public void displayProducts() {
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    // Tìm kiếm theo tên
    public void searchByName(String name) {
        for (Product p : productList) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(p);
            }
        }
    }

    // Sắp xếp theo giá tăng dần
    public void sortByPriceAscending() {
        productList.sort(Comparator.comparingDouble(Product::getPrice));
    }

    // Sắp xếp theo giá giảm dần
    public void sortByPriceDescending() {
        productList.sort(Comparator.comparingDouble(Product::getPrice).reversed());
    }
}
