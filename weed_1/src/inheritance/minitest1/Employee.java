package inheritance.minitest1;

public abstract class Employee {
    protected String id;
    protected String name;
    protected String phone;
    protected String email;

    public Employee(String id, String name, String phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public abstract double calculateSalary();

    public abstract boolean isFullTime();

    public void display() {
        System.out.printf("%s - %s - %s - %s\n", id, name, phone, email);
    }
}
