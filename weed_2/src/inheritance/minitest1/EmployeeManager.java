package inheritance.minitest1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeManager {
    private List<Employee> list = new ArrayList<>();

    public void addEmployee(Employee e) {
        list.add(e);
    }

    public void displayAll() {
        list.forEach(Employee::display);
    }

    public void displayPartTimeEmployees() {
        list.stream()
                .filter(e -> !e.isFullTime())
                .forEach(Employee::display);
    }

    public void displayFullTimeEmployeesBelowAverageSalary() {
        double average = list.stream().mapToDouble(Employee::calculateSalary).average().orElse(0);
        list.stream()
                .filter(e -> e.isFullTime() && e.calculateSalary() < average)
                .forEach(Employee::display);
    }

    public void displayTotalSalary() {
        double total = list.stream().mapToDouble(Employee::calculateSalary).sum();
        System.out.printf("Total Salary for All Employees: %.2f\n", total);
    }

    public void sortFullTimeEmployeesBySalary() {
        list.stream()
                .filter(Employee::isFullTime)
                .sorted(Comparator.comparingDouble(Employee::calculateSalary))
                .forEach(Employee::display);
    }
}