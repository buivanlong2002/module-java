package minitest.mintest_5;

import java.util.*;
import java.time.LocalDate;

public class MaterialManager {
    private List<Material> materials = new ArrayList<>();

    public void add(Material material) {
        materials.add(material);
    }

    public void remove(String id) {
        materials.removeIf(m -> m.getId().equals(id));
    }

    public void update(String id, Material newMaterial) {
        for (int i = 0; i < materials.size(); i++) {
            if (materials.get(i).getId().equals(id)) {
                materials.set(i, newMaterial);
                break;
            }
        }
    }

    public void printAll() {
        for (Material m : materials) {
            System.out.println("ID: " + m.getId() + ", Name: " + m.getName() +
                    ", Amount: " + m.getAmount() + ", RealMoney: " + ((Discount) m).getRealMoney());
        }
    }

    public double calculateTotalDiscountDifference() {
        double total = 0;
        for (Material m : materials) {
            if (m instanceof Discount) {
                total += m.getAmount() - ((Discount) m).getRealMoney();
            }
        }
        return total;
    }

    public static void main(String[] args) {
        MaterialManager manager = new MaterialManager();

        // Tạo 5 bột
        for (int i = 1; i <= 5; i++) {
            manager.add(new CrispyFlour("F" + i, "Bột " + i, LocalDate.now().minusMonths(i), 10000, i * 2));
        }

        // Tạo 5 thịt
        for (int i = 1; i <= 5; i++) {
            manager.add(new Meat("M" + i, "Thịt " + i, LocalDate.now().minusDays(i), 50000, i * 1.5));
        }

        manager.printAll();
        System.out.println("Tổng chênh lệch do chiết khấu: " + manager.calculateTotalDiscountDifference());
    }
}
