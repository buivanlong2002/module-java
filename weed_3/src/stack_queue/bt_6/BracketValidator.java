package stack_queue.bt_6;

import java.util.Stack;

public class BracketValidator {

    public static boolean isValidBrackets(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            // Nếu là dấu ngoặc trái, đưa vào stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Nếu là dấu ngoặc phải, kiểm tra xem có khớp với stack không
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;

                char left = stack.pop();

                if (!isMatchingPair(left, ch)) return false;
            }
        }

        // Nếu sau khi duyệt hết mà stack vẫn còn, thì không hợp lệ
        return stack.isEmpty();
    }

    // Hàm kiểm tra dấu ngoặc trái và phải có khớp nhau không
    private static boolean isMatchingPair(char left, char right) {
        return (left == '(' && right == ')') ||
                (left == '{' && right == '}') ||
                (left == '[' && right == ']');
    }

    public static void main(String[] args) {
        String[] expressions = {
                "s * (s - a) * (s - b) * (s - c)",
                "(- b + (b2 - 4*a*c)^0.5) / 2*a",
                "s * (s - a) * (s - b * (s - c)",
                "s * (s - a) * s - b) * (s - c)",
                "(- b + (b^2 - 4*a*c)^(0.5/ 2*a))"
        };

        for (String expr : expressions) {
            boolean valid = isValidBrackets(expr);
            System.out.println(expr + " → " + (valid ? "Well" : "Invalid"));
        }
    }
}

