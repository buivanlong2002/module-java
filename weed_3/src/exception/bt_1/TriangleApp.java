package exception.bt_1;

import java.util.Scanner;

public class TriangleApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập cạnh a: ");
            double a = scanner.nextDouble();

            System.out.print("Nhập cạnh b: ");
            double b = scanner.nextDouble();

            System.out.print("Nhập cạnh c: ");
            double c = scanner.nextDouble();

            validateTriangle(a, b, c);
            System.out.println("Ba cạnh hợp lệ. Đây là một tam giác.");

        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi không xác định: " + e.getMessage());
        }

        scanner.close();
    }

    public static void validateTriangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Các cạnh phải là số dương.");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Tổng hai cạnh bất kỳ phải lớn hơn cạnh còn lại.");
        }
    }
}
