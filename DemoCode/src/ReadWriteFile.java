import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class ReadWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> listNumber = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                listNumber.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("File does not exist or content error!");
            e.printStackTrace();
        }
        return listNumber;
    }
    public void writeFile(String filePath, int max) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("Max Number: " + max + "\n");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}