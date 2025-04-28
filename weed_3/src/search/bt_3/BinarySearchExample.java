package search.bt_3;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchExample {

    // Bước 3: Khai báo hàm binarySearch
    public static int binarySearch(int[] array, int left, int right, int value) {
        // Bước 4: Khai báo biến middle và gán giá trị cho nó
        while (left <= right) {
            int middle = (left + right) / 2;

            // Bước 5: Nếu array[middle] = value thì return về middle
            if (array[middle] == value) {
                return middle;
            }

            // Bước 6: Nếu value > array[middle], so sánh value với các phần tử phía bên phải của middle
            if (value > array[middle]) {
                left = middle + 1;  // Tìm kiếm ở nửa phải
            }
            // Bước 7: Nếu value < array[middle], so sánh value với các phần tử phía bên trái của middle
            else {
                right = middle - 1;  // Tìm kiếm ở nửa trái
            }
        }
        // Nếu không tìm thấy giá trị
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khởi tạo một mảng bất kỳ với các giá trị được nhập vào từ bàn phím
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Bước 2: Sắp xếp lại mảng theo thứ tự từ bé đến lớn
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        // Nhập giá trị cần tìm kiếm
        System.out.print("Enter the value to search for: ");
        int value = scanner.nextInt();

        // Bước 8: Tìm kiếm bằng hàm binarySearch
        int result = binarySearch(array, 0, array.length - 1, value);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array");
        }

        scanner.close();
    }
}
