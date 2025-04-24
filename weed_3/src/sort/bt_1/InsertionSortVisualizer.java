package sort.bt_1;

public class InsertionSortVisualizer {
    public static void insertionSort(int[] arr) {
        System.out.println("Mảng ban đầu:");
        printArray(arr);

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            System.out.println("\nBước " + i + ":");
            System.out.println("  Chọn key = " + key);

            // Di chuyển các phần tử lớn hơn key về sau
            while (j >= 0 && arr[j] > key) {
                System.out.println("    arr[" + (j + 1) + "] = arr[" + j + "] (" + arr[j] + ")");
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
            System.out.println("  Chèn key vào vị trí arr[" + (j + 1) + "]");
            System.out.print("  Mảng hiện tại: ");
            printArray(arr);
        }

        System.out.println("\nMảng đã sắp xếp:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Hàm main để chạy chương trình
    public static void main(String[] args) {
        int[] array = {9, 5, 1, 4, 3};
        insertionSort(array);
    }
}

