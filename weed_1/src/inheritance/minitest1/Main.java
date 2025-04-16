package inheritance.minitest1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();

        while (true) {
            System.out.println("\n... EMPLOYEE MANAGEMENT SYSTEM ....");
            System.out.println("1. Add Full-time Employee");
            System.out.println("2. Add Part-time Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Display Part-time Employees");
            System.out.println("5. Display Full-time Employees with Salary Below Average");
            System.out.println("6. Display Total Salary");
            System.out.println("7. Sort Full-time Employees by Salary");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Phone: ");
                    String phone = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Bonus: ");
                    double bonus = Double.parseDouble(sc.nextLine());
                    System.out.print("Penalty: ");
                    double penalty = Double.parseDouble(sc.nextLine());
                    System.out.print("Base Salary: ");
                    double baseSalary = Double.parseDouble(sc.nextLine());
                    manager.addEmployee(new FullTimeEmployee(id, name, phone, email, bonus, penalty, baseSalary));
                    break;

                case 2:
                    System.out.print("ID: ");
                    String id2 = sc.nextLine();
                    System.out.print("Name: ");
                    String name2 = sc.nextLine();
                    System.out.print("Phone: ");
                    String phone2 = sc.nextLine();
                    System.out.print("Email: ");
                    String email2 = sc.nextLine();
                    System.out.print("Working Hours: ");
                    int hours = Integer.parseInt(sc.nextLine());
                    manager.addEmployee(new PartTimeEmployee(id2, name2, phone2, email2, hours));
                    break;

                case 3:
                    manager.displayAll();
                    break;

                case 4:
                    manager.displayPartTimeEmployees();
                    break;

                case 5:
                    manager.displayFullTimeEmployeesBelowAverageSalary();
                    break;

                case 6:
                    manager.displayTotalSalary();
                    break;

                case 7:
                    manager.sortFullTimeEmployeesBySalary();
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
