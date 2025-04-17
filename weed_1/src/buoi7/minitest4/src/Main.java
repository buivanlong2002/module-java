import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[6];

        employees[0] = new Fulltime(101, "Nguyễn Văn A", 20, "0123456789", "a@123", 1000000, 150000, 6000000);
        employees[1] = new Fulltime(102, "Nguyễn Văn B", 26, "0123456789", "b@123", 500000, 50000, 5000000);
        employees[2] = new Fulltime(103, "Nguyễn Văn C", 30, "0123456789", "c@123", 2000000, 0, 10000000);
        employees[3] = new Parttime(104, "Nguyễn Văn D", 21, "0123456789", "d@123", 60);
        employees[4] = new Parttime(105, "Nguyễn Văn E", 40, "0123456789", "e@123", 25);
        employees[5] = new Parttime(106, "Nguyễn Thị A", 45, "0123456789", "ed@123", 50);

        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println();
            System.out.println("========================Menu========================");
            System.out.println("1. Tính trung bình lương của nhân viên cả công ty");
            System.out.println("2. Liệt kê danh sách nhân viên toàn thời gian có mức lương thấp hơn mức lương trung bình của các nhân viên trong công ty");
            System.out.println("3. Tính số lương phải trả cho tất cả các nhân viên bán thời gian");
            System.out.println("4. Sắp xếp nhân viên toàn thời gian theo số lương tăng dần");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Trung bình lương của cả công ty là: " + averageSalary(employees));
                    break;
                case 2:
                    double average = averageSalary(employees);
                    System.out.println("Danh sách nhân viên fulltime có mức lương thấp hơn mức lương trung bình của các nhân viên trong công ty là: ");
                    fulltimeLowerAverageSalary(employees, average);
                    break;
                case 3:
                    System.out.println("Số lương phải trả cho tất cả các nhân viên bán thời gian là: " + sumParttimeSalary(employees));
                    break;
                case 4:
                    sortFulltimeByAscendingSalary(employees);
                    break;
                case 0:
                    System.out.println("Đã thoát");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");


            }
        }
    }

    public static double averageSalary(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].payroll();
        }
        return sum / employees.length;
    }

    public static void fulltimeLowerAverageSalary(Employee[] employees, double averageSalary) {
        for (Employee employee : employees) {
            if (employee instanceof Fulltime) {
                Fulltime fulltime = (Fulltime) employee;
                if (fulltime.payroll() < averageSalary) {
                    System.out.println(employee.toString() + " Lương: " + fulltime.payroll());
                }
            }
        }
    }

    public static double sumParttimeSalary(Employee[] employees) {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee instanceof Parttime) {
                Parttime parttime = (Parttime) employee;
                sum += parttime.payroll();
            }
        }
        return sum;
    }

    public static void sortFulltimeByAscendingSalary(Employee[] employees) {
        Fulltime[] fulltimes = new Fulltime[employees.length];
        int count = 0;

        for (Employee employee : employees) {
            if (employee instanceof Fulltime) {
                fulltimes[count++] = (Fulltime) employee;
            }
        }

        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (fulltimes[i].payroll() > fulltimes[j].payroll()) {
                    Fulltime temp = fulltimes[i];
                    fulltimes[i] = fulltimes[j];
                    fulltimes[j] = temp;
                }
            }
        }

        System.out.println("Nhân viên toàn thời gian theo số lương tăng dần: ");
        for (int i = 0; i < count; i++) {
            System.out.println(fulltimes[i] + ", Salary: " + fulltimes[i].payroll());
        }
    }

}