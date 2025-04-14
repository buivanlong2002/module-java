package inheritance.minitest;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Book[] book = new Book[6];
        book[0] = new ProgrammingBook();
        book[1] = new ProgrammingBook("PB101", "Lập trình C++ cơ bản", 95, "Minh Khoa", "C++", "OOP");
        book[2] = new ProgrammingBook("PB102", "Thiết kế Web với HTML & CSS", 85, "Lan Hương", "HTML/CSS", "Responsive Design");
        book[3] = new FictionBook("FB201", "Hành trình vào vũ trụ", 70, "Phan Tuấn", "Viễn tưởng không gian");
        book[4] = new FictionBook("FB202", "Ký ức kẻ du hành", 110, "Lê Thảo", "Viễn tưởng thời gian");
        book[5] = new FictionBook("FB203", "Bí mật rừng già", 140, "Ngô Thanh", "Phiêu lưu kỳ ảo");


        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println();
            System.out.println("========================Menu========================");
            System.out.println("1. Tính tổng tiền của 6 cuốn sách");
            System.out.println("2. Đếm số sách ProgrammingBook có language là \"HTML/CSS\"");
            System.out.println("3. Đếm số sách Fiction có category là \"Viễn tưởng 1\"");
            System.out.println("4. Đếm số sách Fiction có giá <100");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Tổng  tiền 6 cuốn sách là: " + sumPrice(book) + ".000 VNĐ");
                    break;
                case 2:
                    System.out.println("Số sách ProgrammingBook có language là Java là: " + countBookLanguageJava(book));
                    break;
                case 3:
                    System.out.println("Số sách FictionBook có category là Viễn tưởng 1 là: " + countCategory(book));
                    break;
                case 4:
                    System.out.println("Số sách Fiction có giá <100 là: " + countFiction(book));
                    break;
                case 0:
                    System.out.println("Đã thoát");
            }
        }
    }

    public static int sumPrice(Book[] books) {
        int sum = 0;
        for (Book book : books) {
            sum += book.getPrice();
        }
        return sum;
    }

    public static int countBookLanguageJava(Book[] books) {
        int count = 0;
        for (Book book : books) {
            if (book instanceof ProgrammingBook) {
                ProgrammingBook pBook = (ProgrammingBook) book;
                if (pBook.getLanguage().equals("JHTML/CSS")) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int countCategory(Book[] books) {
        int count = 0;
        for (Book book : books) {
            if (book instanceof FictionBook) {
                FictionBook fBook = (FictionBook) book;
                if (fBook.getCategory().equals("Phiêu lưu kỳ ảo")) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int countFiction(Book[] books) {
        int count = 0;
        for (Book book : books) {
            if (book instanceof FictionBook) {
                FictionBook fBook = (FictionBook) book;
                if (fBook.getPrice() < 100) {
                    count++;
                }
            }
        }
        return count;
    }
}
