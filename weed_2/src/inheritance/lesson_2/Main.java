package inheritance.lesson_2;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setXY(2.5F, 1.5F);
        System.out.println(point2D);
        for (float value : point2D.getXY()) {
            System.out.println(value);
        }

        Point3D point3D = new Point3D(2.5F, 1.5F,5.5F);
        System.out.println(point3D);
        for (float value : point3D.getXY()) {
            System.out.println(value);
        }
    }
}
