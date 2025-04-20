package abstract_class_interface.BT_2;

public class Square implements Colorable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    // Phương thức tính diện tích
    public double getArea() {
        return side * side;
    }

    // Triển khai phương thức howToColor của interface Colorable
    @Override
    public String howToColor() {
        return "Color all four sides";
    }
}
