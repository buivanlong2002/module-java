package sort.bt_4;

public class InsertionSorter {

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;

            // Di chuyển các phần tử lớn hơn key về sau
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }

            // Chèn key vào đúng vị trí
            list[j + 1] = key;
        }
    }

    // Hàm main để kiểm tra
    public static void main(String[] args) {
        int[] list = {9, 5, 1, 4, 3};

        System.out.print("Trước khi sắp xếp: ");
        for (int num : list) {
            System.out.print(num + " ");
        }

        insertionSort(list);

        System.out.print("\nSau khi sắp xếp: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
