package data;

import java.util.*;

public class DummyDatabase {
    public static List<String> getClassList() {
        return Arrays.asList("CTK42", "CTK43", "CTK44");
    }

    public static Map<String, List<String>> getStudentsByClass() {
        Map<String, List<String>> data = new HashMap<>();
        data.put("CTK42", Arrays.asList("Nguyễn Văn A", "Trần Thị B"));
        data.put("CTK43", Arrays.asList("Phạm Văn C", "Lê Thị D"));
        data.put("CTK44", Arrays.asList("Hoàng Văn E", "Đỗ Thị F"));
        return data;
    }

    public static Map<String, Integer> getStudentScores() {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Nguyễn Văn A", 85);
        scores.put("Trần Thị B", 78);
        scores.put("Phạm Văn C", 92);
        scores.put("Lê Thị D", 74);
        scores.put("Hoàng Văn E", 88);
        scores.put("Đỗ Thị F", 90);
        return scores;
    }

    public static List<String> getTeachers() {
        return Arrays.asList(
                "ThS. Nguyễn Văn Giảng",
                "ThS. Lê Thị Hạnh",
                "TS. Phạm Quốc Hùng",
                "TS. Trần Thị Mai"
        );
    }
}
