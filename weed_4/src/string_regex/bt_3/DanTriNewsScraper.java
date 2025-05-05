package string_regex.bt_3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class DanTriNewsScraper {

    public static void main(String[] args) {
        String url = "http://dantri.com.vn/the-gioi.htm";  // URL Dân Trí

        try {
            // Kết nối và lấy mã HTML từ trang
            Document doc = Jsoup.connect(url).get();

            // Lọc danh sách các bài viết (selector dựa trên cấu trúc HTML của trang)
            Elements newsItems = doc.select("div.news-item");

            // Kiểm tra và hiển thị thông tin
            int count = 1;
            for (Element item : newsItems) {
                // Tìm thẻ chứa tiêu đề và liên kết
                Element linkElement = item.selectFirst("a");
                Element titleElement = item.selectFirst("h3.news-title");

                if (linkElement != null && titleElement != null) {
                    String title = titleElement.text();
                    String link = linkElement.absUrl("href");

                    // In kết quả ra console
                    System.out.println(count++ + ". " + title);
                    System.out.println("   Link: " + link);
                }
            }

            // Kiểm tra nếu không có bản tin nào được hiển thị
            if (count == 1) {
                System.out.println("Không tìm thấy bản tin nào.");
            }

        } catch (IOException e) {
            System.out.println("Lỗi khi kết nối hoặc đọc trang: " + e.getMessage());
        }
    }
}
