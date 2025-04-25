import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException();
        }
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ReadWriteFile readWriteFile = new ReadWriteFile();
        List<Integer> numbers = readWriteFile.readFile("D:\\CodeGym\\code\\module_java\\DemoCode\\src\\numbers.txt");
        if (numbers.isEmpty()) {
            System.out.println("No numbers found");
            return;
        }
        int maxValue = findMax(numbers);
        readWriteFile.writeFile("D:\\CodeGym\\code\\module_java\\DemoCode\\src\\result.txt", maxValue);
    }
}
