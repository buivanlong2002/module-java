package arr_and_function;

import java.util.Scanner;

public class DeleteIndexOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bước 1: Khai báo và khởi tạo mảng
        System.out.print("Nhập số phần tử N: ");
        int N = sc.nextInt();
        int[] arr = new int[N];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        // Bước 2: Nhập X là phần tử cần xoá
        System.out.print("Nhập phần tử cần xoá X: ");
        int X = sc.nextInt();

        // Bước 3: Tìm X
        int index_del = -1;
        for (int i = 0; i < N; i++) {
            if (arr[i] == X) {
                index_del = i;
                break; // Chỉ xoá phần tử đầu tiên tìm được
            }
        }

        if (index_del == -1) {
            System.out.println("Phần tử " + X + " không tồn tại trong mảng.");
        } else {
            // Bước 4: Xoá phần tử X khỏi mảng
            for (int i = index_del; i < N - 1; i++) {
                arr[i] = arr[i + 1];
            }
            N--; // Giảm kích thước mảng (ảo) sau khi xoá

            // Bước 5: In ra mảng mới
            System.out.println("Mảng sau khi xoá phần tử " + X + ":");
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}

