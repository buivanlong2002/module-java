package arr_and_function;

import java.util.Scanner;

public class test {

        public static int[] updateFirstElement(int[] arr) {
            if (arr != null && arr.length > 0) {
                arr[0] = 100;
            }
            return arr;
        }

        public static void main(String[] args) {
            int[] numbers = {4, 2, 3, 4};
            int[] updated = updateFirstElement(numbers);

            for (int num : updated) {
                System.out.print(num + " ");
            }

        }
    }

