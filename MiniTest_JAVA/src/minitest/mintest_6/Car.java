package minitest.mintest_6;

public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(String id, String brand, int year, int numberOfSeats) {
        super(id, brand, year);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public double calculateTax() {
        return numberOfSeats * 300;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car - ID: " + id + ", Brand: " + brand + ", Year: " + year +
                ", Seats: " + numberOfSeats + ", Tax: " + calculateTax());
    }
}

