package oop;
public class Student {
    String id;
    String fullName;
    String email;
    int age;
    double grade;


    public Student(String id, String fullName, String email, int age, double grade) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.age = age;
        this.grade = grade;
    }

    public static void main(String[] args) {

        Student[] students = new Student[5];

        students[0] = new Student("SV001", "Nguyen Van A", "nguyenvanA@gmail.com", 20, 8.5);
        students[1] = new Student("SV002", "Bùi Văn long", "Longcongchua@gmail.com", 21, 7.0);
        students[2] = new Student("SV003", "Anh Tuấn kk", "TuanBanhBeo@gmail.com", 22, 4.5);
        students[3] = new Student("SV004", "Đào Duy Anh", "AnhCongTu@gmail.com", 19, 6.5);
        students[4] = new Student("SV005", "Phạm Trung Hiếu", "hieubaclieu@gmail.com", 20, 5.0);

        //  Tính độ tuổi trung bình
        double totalAge = 0;
        for (Student s : students) {
            totalAge += s.age;
        }
        double averageAge = totalAge / students.length;
        System.out.println("Độ tuổi trung bình: " + averageAge);

        // Đếm số sinh viên có điểm > 5
        int countPassed = 0;
        for (Student s : students) {
            if (s.grade > 5) {
                countPassed++;
            }
        }
        System.out.println("Số sinh viên đạt (grade > 5): " + countPassed);

        //  In email của sinh viên tên "Nguyen Van A"
        boolean found = false;
        for (Student s : students) {
            if (s.fullName.equals("Nguyen Van A")) {
                System.out.println("Email của Nguyen Van A: " + s.email);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên tên Nguyen Van A.");
        }
    }
}
