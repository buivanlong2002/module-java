package stack_queue.bt_1;

import java.util.Stack;

public class ReverseWordsUsingStack {

    public static String reverseWords(String input) {
        Stack<String> wStack = new Stack<>();


        for (String mWord : input.trim().split("\\s+")) {
            wStack.push(mWord);
        }


        StringBuilder outp = new StringBuilder();
        while (!wStack.isEmpty()) {
            outp.append(wStack.pop());
            if (!wStack.isEmpty()) {
                outp.append(" ");
            }
        }

        return outp.toString();
    }

    public static void main(String[] args) {
        String input = "Hello world from Java";
        String reversed = reverseWords(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
}
