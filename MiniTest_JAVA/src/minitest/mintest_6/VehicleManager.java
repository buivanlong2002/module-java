package minitest.mintest_6;

import java.util.*;

public class VehicleManager {
    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    private LinkedList<String> history = new LinkedList<>();

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
        history.add("Added vehicle: " + v.getId());
    }

    public void removeVehicle(String id) {
        Vehicle toRemove = null;
        for (Vehicle v : vehicles) {
            if (v.getId().equalsIgnoreCase(id)) {
                toRemove = v;
                break;
            }
        }
        if (toRemove != null) {
            vehicles.remove(toRemove);
            history.add("Removed vehicle: " + id);
            System.out.println("Vehicle removed.");
        } else {
            System.out.println("Vehicle not found.");
        }
    }

    public void displayAllVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles to display.");
            return;
        }
        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }

    public void displayTaxReport() {
        System.out.println("--- Tax Report ---");
        for (Vehicle v : vehicles) {
            System.out.println("ID: " + v.getId() + ", Tax: " + v.calculateTax());
        }
    }

    public void sortByYear() {
        Collections.sort(vehicles); // dùng compareTo
        history.add("Sorted vehicles by year");
    }

    public void sortByBrand() {
        vehicles.sort(new VehicleBrandComparator());
        history.add("Sorted vehicles by brand");
    }

    public void sortByTax() {
        vehicles.sort(new VehicleTaxComparator());
            history.add("Sorted vehicles by tax");
    }

    public void printHistory() {
        System.out.println("--- Operation History ---");
        for (String h : history) {
            System.out.println(h);
        }
    }
}
