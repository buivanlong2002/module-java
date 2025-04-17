public class Parttime extends Employee {
    private int numberWorking;

    public Parttime() {
    }

    public Parttime(int numberWorking) {
        this.numberWorking = numberWorking;
    }

    public Parttime(int id, String name, int age, String phone, String email, int numberWorking) {
        super(id, name, age, phone, email);
        this.numberWorking = numberWorking;
    }

    @Override
    public double payroll() {
        return numberWorking * 100000;
    }
}
