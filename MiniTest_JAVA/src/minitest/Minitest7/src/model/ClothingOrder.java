package minitest.Minitest7.src.model;

public class ClothingOrder extends Order {
    private final double basePrice;
    private final Size size;

    public ClothingOrder(String orderId, String customerName, int orderDate, double basePrice, Size size) {
        super(orderId, customerName, orderDate);
        this.basePrice = basePrice;
        this.size = size;
    }
    public double getBasePrice() {
        return basePrice;
    }
    public Size getSize() {
        return size;
    }

    @Override
    public void displayInfo() {
        System.out.println("Clothing Order - Order ID: " + super.getOrderId()
                + " Customer Name: " + super.getCustomerName()
                + " Order Date: " + super.getOrderDate()
                + " Base Price: " + getBasePrice()
                + " Size: " + getSize()
                + ", Total Price: " + this.calculateTotalPrice());
    }

    @Override
    public double calculateTotalPrice() {
        if (size == Size.L || size == Size.XL) {
            return this.getBasePrice() * 1.1;
        }
        return this.getBasePrice();
    }
}
