package stack_queue.bt_2;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {

    public static void main(String[] args) {
        String input = "Java is great and JAVA is powerful. java is everywhere!";

        // Bước 1: Xử lý chuỗi (chuẩn hoá - chữ thường)
        input = input.toLowerCase().replaceAll("[^a-z\\s]", ""); // loại bỏ dấu câu

        // Bước 2: Tách từ
        String[] words = input.trim().split("\\s+");

        // Bước 3: Đếm từ
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        // Bước 4: Hiển thị kết quả
        System.out.println("Tần suất xuất hiện của các từ:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

