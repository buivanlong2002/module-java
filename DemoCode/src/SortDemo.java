public class SortDemo {
    public static void bubbleSort(int[] arr) {


        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Kết quả: ");
        printArray(arr);
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        System.out.print("Kết quả: ");
        printArray(arr);
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.print("Kết quả: ");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array2 = {2, 6, 9, 10, 4, 5};


        long start = System.nanoTime();

        bubbleSort(array2.clone());
        System.out.println();

        long end = System.nanoTime();
        long durationInNano = (end - start) / 1_000_000;
        System.out.println(" Thời gian thực thi: " + durationInNano + " ms");


        long start1 = System.nanoTime();

        selectionSort(array2.clone());

        long end1 = System.nanoTime();
        long durationInNano1 = (end1 - start1) / 1_000_000;
        System.out.println(" Thời gian thực thi: " + durationInNano1 + " ms");


        long start2 = System.nanoTime();
        insertionSort(array2.clone());
        long end2 = System.nanoTime();
        long durationInNano2 = (end2 - start2) / 1_000_000;
        System.out.println(" Thời gian thực thi: " + durationInNano1 + " ms");
    }
}
