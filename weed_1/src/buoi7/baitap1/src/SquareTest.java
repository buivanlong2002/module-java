
package buoi7.baitap1.src;
public class SquareTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[1] = new Circle(1.5);
        shapes[2] = new Rectangle(1, 1.5);
        shapes[3] = new Square(2.5);
        shapes[4] = new Circle(4.5);

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape);
        }
    }
}
