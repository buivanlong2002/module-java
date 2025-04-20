package minitest.mintest_6;

public class Motorbike extends Vehicle {
    private int enginePower;

    public Motorbike(String id, String brand, int year, int enginePower) {
        super(id, brand, year);
        this.enginePower = enginePower;
    }

    public int getEnginePower() {
        return enginePower;
    }

    @Override
    public double calculateTax() {
        return enginePower < 100 ? 500 : 1000;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorbike - ID: " + id + ", Brand: " + brand + ", Year: " + year +
                ", Engine Power: " + enginePower + "cc, Tax: " + calculateTax());
    }
}

