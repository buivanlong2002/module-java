package arr_and_function;

import java.util.Scanner;

public class SumColArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số hàng và cột
        System.out.print("Nhập số hàng: ");
        int rows = sc.nextInt();
        System.out.print("Nhập số cột: ");
        int cols = sc.nextInt();

        // Khai báo và khởi tạo mảng
        int[][] arr = new int[rows][cols];

        // Nhập giá trị cho từng phần tử
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }

        // Nhập chỉ số cột cần tính tổng
        System.out.print("Nhập chỉ số cột cần tính tổng (0 đến " + (cols - 1) + "): ");
        int colIndex = sc.nextInt();

        // Kiểm tra hợp lệ
        if (colIndex < 0 || colIndex >= cols) {
            System.out.println("Chỉ số cột không hợp lệ!");
            return;
        }

        // Tính tổng cột
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += arr[i][colIndex];
        }

        // In kết quả
        System.out.println("Tổng các phần tử ở cột " + colIndex + " là: " + sum);
    }
}
