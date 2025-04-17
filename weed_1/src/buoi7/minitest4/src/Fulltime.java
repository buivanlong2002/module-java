public class Fulltime extends Employee {
    private double bonus;
    private double fine;
    private double basicSalary;

    public Fulltime() {
    }

    public Fulltime(double bonus, double fine, double basicSalary) {
        this.bonus = bonus;
        this.fine = fine;
        this.basicSalary = basicSalary;
    }

    public Fulltime(int id, String name, int age, String phone, String email, double bonus, double fine, double basicSalary) {
        super(id, name, age, phone, email);
        this.bonus = bonus;
        this.fine = fine;
        this.basicSalary = basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public double payroll() {
        return basicSalary + (bonus - fine);
    }


}
