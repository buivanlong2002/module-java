package arr_and_function;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập so n: ");
        int n = sc.nextInt();
        int a = 1 ;
        for (int i = 1; i <= n; i++) {
            a = a*i ;
        }
        System.out.println(a);
    }
}
