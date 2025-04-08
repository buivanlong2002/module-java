package arr_and_function;

import java.util.Scanner;

public class MinindexOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;

        System.out.println("Chọn cách khởi tạo mảng:");
        System.out.println("1. Nhập từ bàn phím");
        System.out.println("2. Khởi tạo sẵn");
        System.out.print("Lựa chọn của bạn: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            // Người dùng nhập từ bàn phím
            System.out.print("Nhập số phần tử của mảng: ");
            int n = sc.nextInt();
            arr = new int[n];
            System.out.println("Nhập các phần tử:");
            for (int i = 0; i < n; i++) {
                System.out.print("arr[" + i + "] = ");
                arr[i] = sc.nextInt();
            }
        } else {
            // Mảng được khởi tạo sẵn
            arr = new int[] {12, 5, 7, 22, 3, 9};
            System.out.print("Mảng được khởi tạo sẵn: ");
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // Tìm giá trị nhỏ nhất
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // In kết quả
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);

        sc.close();
    }
}
