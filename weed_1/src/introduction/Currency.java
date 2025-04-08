package introduction;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vnd = 23000;
        double usd ;
        System.out.println("Mời bạn nhập số tiền (usd) :");
        usd = sc.nextDouble();
        vnd = usd*vnd;
        System.out.println("Quy đổi sang tiền VND: " + vnd +" VND");
    }
}
