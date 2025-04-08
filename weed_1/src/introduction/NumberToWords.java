package introduction;

import java.util.Scanner;

public class NumberToWords {

    // Các mảng cho số từ 0 đến 19, hàng chục và hàng trăm
    private static final String[] belowTwenty = {
            "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen",
            "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    // Hàm chính để chuyển đổi số sang chữ
    public static String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        return helper(num).trim();
    }

    // Hàm phụ xử lý các trường hợp số dưới 1000
    private static String helper(int num) {
        if (num == 0) {
            return "";
        } else if (num < 20) {
            return belowTwenty[num] + " ";
        } else if (num < 100) {
            return tens[num / 10] + " " + helper(num % 10);
        } else {
            return belowTwenty[num / 100] + " hundred " + helper(num % 100);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (0-999): ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Please enter a number between 0 and 999.");
        } else {
            System.out.println("Number in words: " + numberToWords(number));
        }
    }
}
