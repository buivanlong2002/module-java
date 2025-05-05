package string_regex.bt_3;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class DanTriNewsWithRegex {

    public static void main(String[] args) {
        String url = "http://dantri.com.vn/the-gioi.htm";  // URL Dân Trí

        try {
            // Kết nối và lấy mã HTML từ trang
            Document doc = Jsoup.connect(url).get();
            String htmlContent = doc.html();

            // Biểu thức chính quy để lấy tiêu đề và liên kết bài viết
            String regex = "<a href=\"(.*?)\"[^>]*><h3 class=\"news-title\">(.*?)</h3></a>";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(htmlContent);

            // Lọc và hiển thị các kết quả
            int count = 1;
            while (matcher.find()) {
                String link = matcher.group(1);   // Lấy link từ nhóm 1
                String title = matcher.group(2);  // Lấy tiêu đề từ nhóm 2

                System.out.println(count++ + ". " + title);
                System.out.println("   Link: " + link);
            }

            if (count == 1) {
                System.out.println("Không tìm thấy bản tin nào.");
            }

        } catch (IOException e) {
            System.out.println("Lỗi khi kết nối hoặc đọc trang: " + e.getMessage());
        }
    }
}

