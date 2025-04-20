package minitest.mintest_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VehicleManager manager = new VehicleManager();
        int choice;

        do {
            System.out.println("\n==== VEHICLE MANAGEMENT MENU ====");
            System.out.println("1. Add vehicle");
            System.out.println("2. Remove vehicle by ID");
            System.out.println("3. Display all vehicles");
            System.out.println("4. Display tax report");
            System.out.println("5. Sort by year");
            System.out.println("6. Sort by brand");
            System.out.println("7. Sort by tax");
            System.out.println("8. View operation history");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Choose type (1. Car / 2. Motorbike): ");
                    int type = sc.nextInt();
                    sc.nextLine();

                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Brand: ");
                    String brand = sc.nextLine();
                    System.out.print("Year: ");
                    int year = sc.nextInt();
                    sc.nextLine();

                    if (type == 1) {
                        System.out.print("Number of seats: ");
                        int seats = sc.nextInt();
                        sc.nextLine();
                        manager.addVehicle(new Car(id, brand, year, seats));
                    } else if (type == 2) {
                        System.out.print("Engine power (cc): ");
                        int power = sc.nextInt();
                        sc.nextLine();
                        manager.addVehicle(new Motorbike(id, brand, year, power));
                    } else {
                        System.out.println("Invalid type.");
                    }
                    break;
                case 2:
                    System.out.print("Enter ID to remove: ");
                    String removeId = sc.nextLine();
                    manager.removeVehicle(removeId);
                    break;
                case 3:
                    manager.displayAllVehicles();
                    break;
                case 4:
                    manager.displayTaxReport();
                    break;
                case 5:
                    manager.sortByYear();
                    System.out.println("Sorted by year.");
                    break;
                case 6:
                    manager.sortByBrand();
                    System.out.println("Sorted by brand.");
                    break;
                case 7:
                    manager.sortByTax();
                    System.out.println("Sorted by tax.");
                    break;
                case 8:
                    manager.printHistory();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}
