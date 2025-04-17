
package buoi7.baitap1.src;
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle = new Rectangle("orange", true, 2.5, 3.8);
        System.out.println(rectangle);
        rectangle.resize();
    }
}
