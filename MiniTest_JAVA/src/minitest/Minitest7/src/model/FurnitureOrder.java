package minitest.Minitest7.src.model;

public class FurnitureOrder extends Order {
    private final double basePrice;
    private static final double SHIPPING_COST = 200; // Phí vận chuyển 200k

    public FurnitureOrder(String orderId, String customerName, int orderDate, double basePrice) {
        super(orderId, customerName, orderDate);
        this.basePrice = basePrice;
    }
    public double getBasePrice() {
        return basePrice;
    }

    @Override
    public double calculateTotalPrice() {
        return this.getBasePrice() + SHIPPING_COST;
    }

    @Override
    public void displayInfo() {
        System.out.println("Furniture Order ID: " + super.getOrderId() +
                ", Customer: " + super.getCustomerName() +
                ", Order Date: " + super.getOrderDate() +
                ", Base Price: " + this.getBasePrice() +
                ", Total Price: " + this.calculateTotalPrice());
    }
}
