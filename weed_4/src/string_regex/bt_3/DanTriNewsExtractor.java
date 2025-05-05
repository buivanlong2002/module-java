package string_regex.bt_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class DanTriNewsExtractor {
    public static void main(String[] args) {
        try {
            // Bước 1: Lấy nội dung HTML từ trang web
            String urlString = "https://dantri.com.vn/the-gioi.htm";
            URL url = new URL(urlString);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
            StringBuilder htmlBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                htmlBuilder.append(line);
            }
            reader.close();
            // Bước 2: Dùng Regex để trích xuất tiêu đề và link bài viết
            String html = htmlBuilder.toString();
            // Dựa vào cấu trúc thực tế: <h3 class="article-title"> <a href="...">Tiêu đề</a> </h3>
            Pattern pattern = Pattern.compile(
                    "<h3 class=\"article-title\">\\s*<a[^>]*href=\"([^\"]+)\"[^>]*>(.*?)</a>",
                    Pattern.CASE_INSENSITIVE | Pattern.DOTALL
            );
            Matcher matcher = pattern.matcher(html);
            System.out.println(":newspaper: Danh sách bản tin từ Dân Trí (thế giới):");
            int count = 0;
            while (matcher.find()) {
                count++;
                String link = "https://dantri.com.vn" + matcher.group(1).trim();
                String title = matcher.group(2).replaceAll("<[^>]+>", "").trim(); // xóa thẻ HTML phụ nếu có
                System.out.println(count + ". " + title);
                System.out.println("   :link: " + link);
            }
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
