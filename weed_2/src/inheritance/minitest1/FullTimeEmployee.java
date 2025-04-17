package inheritance.minitest1;

public class FullTimeEmployee extends Employee {
    private double bonus;
    private double penalty;
    private double baseSalary;

    public FullTimeEmployee(String id, String name, String phone, String email,
                            double bonus, double penalty, double baseSalary) {
        super(id, name, phone, email);
        this.bonus = bonus;
        this.penalty = penalty;
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (bonus - penalty);
    }

    @Override
    public boolean isFullTime() {
        return true;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("Type: FullTime | Salary: %.2f\n", calculateSalary());
    }
}

