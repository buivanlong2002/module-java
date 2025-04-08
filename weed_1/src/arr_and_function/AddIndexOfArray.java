package arr_and_function;

import java.util.Scanner;

public class AddIndexOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bước 1: Khai báo và khởi tạo mảng
        System.out.print("Nhập số phần tử N: ");
        int N = sc.nextInt();
        int[] arr = new int[N + 1]; // +1 để chừa chỗ chèn phần tử

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        // Bước 2: Nhập X là số cần chèn
        System.out.print("Nhập phần tử cần chèn X: ");
        int X = sc.nextInt();

        // Bước 3: Nhập vị trí cần chèn
        System.out.print("Nhập vị trí cần chèn (index): ");
        int index = sc.nextInt();

        // Bước 4: Kiểm tra điều kiện chèn
        if (index < 0 || index > N) {
            System.out.println("Không thể chèn phần tử vào mảng.");
        } else {
            // Bước 5: Thực hiện chèn
            for (int i = N; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = X;
            N++;

            // Bước 6: In ra mảng sau khi chèn
            System.out.println("Mảng sau khi chèn:");
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}

