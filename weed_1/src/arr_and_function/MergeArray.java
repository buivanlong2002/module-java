package arr_and_function;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nhâ vào mảng thứ nhất
        System.out.print("Nhập số phần tử N của mảng thứ nhất: ");
        int N = sc.nextInt();
        int[] arr = new int[N]; // +1 để chừa chỗ chèn phần tử
        for (int i = 0; i < N; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        System.out.println("mảng thứ nhất:");
        for (int i = 0; i <arr.length; i++) {
            System.out.print( + arr[i] + "\t");
        }
        System.out.println("\n");
        // nhập vào mảng thứ hai
        System.out.print("Nhập số phần tử M mảng thứ hai: ");
        int M = sc.nextInt();
        int[] arr_1 = new int[M];
        for (int i = 0; i < M; i++) {
            System.out.print("arr_1[" + i + "] = ");
            arr_1[i] = sc.nextInt();
        }
        System.out.println("Mảng thứ hai: ");
        for (int i = 0; i < arr_1.length; i++) {
            System.out.print(  arr_1[i] + "\t");
        }
        System.out.println("\n");
        int C = N + M ;
        int[] arr_2 = new int[C];
        for (int i = 0; i < arr_2.length-M; i++) {
            arr_2[i] = arr[i];
        }
        int a = 0 ;
        for (int i = N; i < arr_2.length; i++) {
            arr_2[i] = arr_1[a];
            a++ ;
        }
        System.out.println("Mảng thứ 3 gộp mảng thứ hai và mảng thứ nhất:  " );
        for (int i = 0; i < arr_2.length; i++) {
            System.out.print(  arr_2[i] + "\t");
        }
        System.out.println("\n");


    }
}
