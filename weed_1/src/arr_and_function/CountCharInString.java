package arr_and_function;

import java.util.Scanner;

public class CountCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bước 1: Khai báo một chuỗi và gán giá trị
        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        // Bước 2: Khai báo một biến ký tự và nhập từ bàn phím
        System.out.print("Nhập ký tự cần đếm: ");
        char ch = sc.next().charAt(0);

        // Bước 3: Khai báo biến count và gán giá trị 0
        int count = 0;

        // Bước 4: Duyệt từng ký tự trong chuỗi và đếm nếu trùng
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        // In kết quả
        System.out.println("Ký tự '" + ch + "' xuất hiện " + count + " lần trong chuỗi.");
    }
}
