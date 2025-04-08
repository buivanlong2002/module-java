package arr_and_function;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập so bắt đầu: ");
        int n = sc.nextInt();
        System.out.println("nhập số  kết quả cần in ra");
       int m = sc.nextInt();
       int a = 0 ;
        for (int i = n/2; i <= 1000; i++) {
            System.out.println(i*2);
           a++ ;
           if(a == m){
               break;
           }
        }

    }
}
