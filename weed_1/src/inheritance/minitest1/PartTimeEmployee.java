package inheritance.minitest1;

public class PartTimeEmployee extends Employee {
    private int workingHours;

    public PartTimeEmployee(String id, String name, String phone, String email, int workingHours) {
        super(id, name, phone, email);
        this.workingHours = workingHours;
    }

    @Override
    public double calculateSalary() {
        return workingHours * 100000;
    }

    @Override
    public boolean isFullTime() {
        return false;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("Type: PartTime | Salary: %.2f\n", calculateSalary());
    }
}

