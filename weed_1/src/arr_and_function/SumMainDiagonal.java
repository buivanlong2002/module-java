package arr_and_function;

import java.util.Scanner;

public class SumMainDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cột và hàng trong arr ma trận vuông: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        // Nhập giá trị cho mảng
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }

        // In mảng 2 chiều ra màn hình
        System.out.println("\nMa trận bạn vừa nhập là:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(); // xuống dòng sau mỗi hàng
        }

        // (Bonus) Tính tổng đường chéo chính
        int sumDiagonal = 0;
        for (int i = 0; i < n; i++) {
            sumDiagonal += arr[i][i];
        }
        System.out.println("Tổng đường chéo chính là: " + sumDiagonal);
    }
}
