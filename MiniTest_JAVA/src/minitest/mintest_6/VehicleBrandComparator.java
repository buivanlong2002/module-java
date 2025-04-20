package minitest.mintest_6;


import java.util.Comparator;

public class VehicleBrandComparator implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle v1, Vehicle v2) {
        return v1.getBrand().compareToIgnoreCase(v2.getBrand());
    }
}

class VehicleTaxComparator implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle v1, Vehicle v2) {
        return Double.compare(v1.calculateTax(), v2.calculateTax());
    }
}

