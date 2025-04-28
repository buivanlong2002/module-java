package search.bt_2;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        // Bước 2: Tính tần suất xuất hiện của các ký tự trong chuỗi vừa nhập
        int[] frequentChar = new int[255];  // Tạo mảng tần suất cho các ký tự ASCII

        // Duyệt qua chuỗi và tính tần suất của các ký tự
        for (int i = 0; i < inputString.length(); i++) {
            int ascii = (int) inputString.charAt(i);  // Chuyển ký tự thành mã ASCII
            frequentChar[ascii] += 1;  // Tăng tần suất xuất hiện của ký tự đó
        }

        // Bước 3: Tìm ký tự có tần suất xuất hiện nhiều nhất
        int max = 0;  // Biến lưu tần suất lớn nhất
        char character = (char) 255;  // Ký tự có tần suất xuất hiện nhiều nhất (khởi tạo)

        for (int j = 0; j < 255; j++) {
            if (frequentChar[j] > max) {  // Nếu tần suất hiện tại lớn hơn tần suất max
                max = frequentChar[j];  // Cập nhật tần suất max
                character = (char) j;   // Cập nhật ký tự có tần suất lớn nhất
            }
        }

        // In kết quả
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }
}
