import java.util.Arrays;
import java.util.Random;

public class SortBenchmark {
    public static void main(String[] args) {
        int size = 10000;
        int[] originalArray = generateRandomArray(size);
        int[] heapArray = Arrays.copyOf(originalArray, originalArray.length);
        int[] bubbleArray = Arrays.copyOf(originalArray, originalArray.length);

        HeapSort heapSort = new HeapSort();

        // HeapSort
        long startHeap = System.currentTimeMillis();
        heapSort.sort(heapArray);
        long endHeap = System.currentTimeMillis();
        System.out.println("HeapSort time: " + (endHeap - startHeap) + " ms");

        // BubbleSort
        long startBubble = System.currentTimeMillis();
        bubbleSort(bubbleArray);
        long endBubble = System.currentTimeMillis();
        System.out.println("BubbleSort time: " + (endBubble - startBubble) + " ms");
    }

    // Generate random array
    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(size);
        }
        return arr;
    }

    // BubbleSort implementation
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}

// HeapSort class riêng biệt
class HeapSort {
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) heapify(arr, n, i);
        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }

    void heapify(int[] arr, int n, int i) {
        int largest = i, left = 2 * i + 1, right = 2 * i + 2;
        if (left < n && arr[left] > arr[largest]) largest = left;
        if (right < n && arr[right] > arr[largest]) largest = right;
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }

    void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
