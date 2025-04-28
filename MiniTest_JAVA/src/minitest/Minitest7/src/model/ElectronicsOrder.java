package minitest.Minitest7.src.model;

public class ElectronicsOrder extends Order{
    private final double itemPrice;
    private final int warrantyMonths;

    public ElectronicsOrder(String orderId, String customerName, int orderDate, double itemPrice, int warrantyMonths) {
        super(orderId, customerName, orderDate);
        this.itemPrice = itemPrice;
        this.warrantyMonths = warrantyMonths;
    }
    public double getItemPrice() {
        return itemPrice;
    }
    public int getWarrantyMonths() {
        return warrantyMonths;
    }
    @Override
    public void displayInfo() {
        System.out.println("Electronics Order - Order ID: " + super.getOrderId()
                + " Customer Name: " + super.getCustomerName()
                + " Order Date: " + super.getOrderDate()
                + " Item Price: " + getItemPrice()
                + " Warranty Months: " + getWarrantyMonths()
                + ", Total Price: " + this.calculateTotalPrice());
    }
    @Override
    public double calculateTotalPrice() {
        return itemPrice + (warrantyMonths * 50);
    }
}
