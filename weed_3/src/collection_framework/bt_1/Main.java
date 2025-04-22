package collection_framework.bt_1;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();

        manager.addProduct(new Product("P01", "Laptop", 1200));
        manager.addProduct(new Product("P02", "Phone", 800));
        manager.addProduct(new Product("P03", "Tablet", 500));

        System.out.println("== Danh sách sản phẩm ==");
        manager.displayProducts();

        System.out.println("\n== Sửa sản phẩm P02 ==");
        manager.updateProduct("P02", "Smartphone", 900);
        manager.displayProducts();

        System.out.println("\n== Tìm kiếm theo tên 'lap' ==");
        manager.searchByName("lap");

        System.out.println("\n== Sắp xếp theo giá tăng dần ==");
        manager.sortByPriceAscending();
        manager.displayProducts();

        System.out.println("\n== Xoá sản phẩm P01 ==");
        manager.deleteProduct("P01");
        manager.displayProducts();
    }
}
