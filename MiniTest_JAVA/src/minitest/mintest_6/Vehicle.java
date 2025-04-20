package minitest.mintest_6;

public abstract class Vehicle implements Taxable, Comparable<Vehicle> {
    protected String id;
    protected String brand;
    protected int year;


    public Vehicle(String id, String brand, int year) {
        this.id = id;
        this.brand = brand;
        this.year = year;
    }


    public String getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }


    public abstract void displayInfo();


    @Override
    public int compareTo(Vehicle other) {
        return Integer.compare(this.year, other.year);
    }
}
