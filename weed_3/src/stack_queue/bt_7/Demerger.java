package stack_queue.bt_7;

import java.io.*;
import java.util.*;

public class Demerger {

    static class Person {
        String name;
        String gender;
        String dob;

        Person(String name, String gender, String dob) {
            this.name = name;
            this.gender = gender;
            this.dob = dob;
        }

        @Override
        public String toString() {
            return name + "," + gender + "," + dob;
        }
    }

    public static void demerge(String inputFile, String outputFile) {
        Queue<Person> femaleQueue = new LinkedList<>();
        Queue<Person> maleQueue = new LinkedList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length != 3) continue; // bỏ qua dòng sai định dạng

                Person p = new Person(parts[0].trim(), parts[1].trim(), parts[2].trim());

                if (p.gender.equalsIgnoreCase("Nữ")) {
                    femaleQueue.offer(p);
                } else {
                    maleQueue.offer(p);
                }
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
                while (!femaleQueue.isEmpty()) {
                    bw.write(femaleQueue.poll().toString());
                    bw.newLine();
                }

                while (!maleQueue.isEmpty()) {
                    bw.write(maleQueue.poll().toString());
                    bw.newLine();
                }
            }

            System.out.println("Ghi file hoàn tất: " + outputFile);

        } catch (IOException e) {
            System.err.println("Lỗi xử lý file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String input = "input.txt";   // tên file đầu vào
        String output = "output.txt"; // tên file kết quả

        demerge(input, output);
    }
}
