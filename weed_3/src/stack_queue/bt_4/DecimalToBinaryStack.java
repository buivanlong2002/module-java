package stack_queue.bt_4;

import java.util.Stack;

public class DecimalToBinaryStack {

    public static String convertToBinary(int decimalNumber) {
        Stack<Integer> stack = new Stack<>();

        // Bước 2 + 3: Chia cho 2 và lưu phần dư vào stack
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            stack.push(remainder);
            decimalNumber /= 2;
        }

        // Bước 4: Đọc phần tử trong stack để tạo chuỗi nhị phân
        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.length() > 0 ? binary.toString() : "0"; // xử lý trường hợp decimal = 0
    }

    public static void main(String[] args) {
        int decimal = 30;
        String binary = convertToBinary(decimal);

        System.out.println("Số thập phân: " + decimal);
        System.out.println("Số nhị phân : " + binary);
    }
}
