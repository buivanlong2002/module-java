package stack_queue.bt_5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeChecker {

    public static boolean isPalindrome(String input) {
        // Bước 1: Chuẩn hóa chuỗi (bỏ khoảng trắng, không phân biệt chữ hoa thường)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Bước 2: Đưa từng ký tự vào stack và queue
        for (char c : normalized.toCharArray()) {
            stack.push(c);
            queue.offer(c);
        }

        // Bước 3: So sánh từng phần tử từ stack và queue
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.poll())) {
                return false; // Nếu khác nhau thì không phải palindrome
            }
        }

        return true; // Nếu so sánh hết mà giống nhau thì là palindrome
    }

    public static void main(String[] args) {
        String test = "Able was I ere I saw Elba";

        if (isPalindrome(test)) {
            System.out.println("\"" + test + "\" là chuỗi Palindrome.");
        } else {
            System.out.println("\"" + test + "\" không phải là chuỗi Palindrome.");
        }
    }
}

