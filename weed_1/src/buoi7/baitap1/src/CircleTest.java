package buoi7.baitap1.src;
public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println("Diện tích: " + circle.getArea());
        circle.resize();


        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
    }
}