import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadWriteFile readWriteFile = new ReadWriteFile();

        // Đường dẫn file đầu vào chứa các số nguyên (mỗi số trên 1 dòng)
        String inputPath = "input.txt";

        // Đường dẫn file đầu ra ghi số lớn nhất
        String outputPath = "output.txt";

        // Đọc danh sách số nguyên từ file
        List<Integer> numbers = readWriteFile.readFile(inputPath);

        if (!numbers.isEmpty()) {
            // Tìm số lớn nhất
            int max = numbers.get(0);
            for (int number : numbers) {
                if (number > max) {
                    max = number;
                }
            }

            System.out.println("Max number is: " + max);

            // Ghi kết quả vào file
            readWriteFile.writeFile(outputPath, max);
        } else {
            System.out.println("File rỗng hoặc có lỗi khi đọc file.");
        }
    }

}