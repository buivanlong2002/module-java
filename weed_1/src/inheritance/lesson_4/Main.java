package inheritance.lesson_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập cạnh 1: ");
        double side1 = sc.nextDouble();

        System.out.print("Nhập cạnh 2: ");
        double side2 = sc.nextDouble();

        System.out.print("Nhập cạnh 3: ");
        double side3 = sc.nextDouble();
        sc.nextLine(); // clear buffer

        System.out.print("Nhập màu sắc cho tam giác: ");
        String color = sc.nextLine();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);

        System.out.println("\n--- Thông tin tam giác ---");
        System.out.println("Màu sắc: " + triangle.getColor());
        System.out.println("Chu vi: " + triangle.getPerimeter());
        System.out.println("Diện tích: " + triangle.getArea());
        System.out.println(triangle.toString());

        sc.close();
    }
}
