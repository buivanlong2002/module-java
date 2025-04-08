package arr_and_function;

import java.util.Scanner;

public class MaxIndexOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập kích thước ma trận
        System.out.print("Nhập số hàng (rows): ");
        int rows = sc.nextInt();
        System.out.print("Nhập số cột (cols): ");
        int cols = sc.nextInt();

        double[][] matrix = new double[rows][cols];

        // Nhập các phần tử của ma trận
        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextDouble();
            }
        }

        // Khởi tạo phần tử lớn nhất
        double max = matrix[0][0];
        int maxRow = 0, maxCol = 0;

        // Duyệt ma trận để tìm phần tử lớn nhất
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        // In ra kết quả
        System.out.println("Phần tử lớn nhất trong ma trận là: " + max);
        System.out.println("Tọa độ: dòng " + maxRow + ", cột " + maxCol);

        sc.close();
    }
}
