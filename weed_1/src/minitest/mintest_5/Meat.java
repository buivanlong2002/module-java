package minitest.mintest_5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Meat extends Material implements Discount {
    private double weight;

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return weight * cost;
    }

    @Override
    public LocalDate getExpiryDate() {
        return manufacturingDate.plusDays(7);
    }

    @Override
    public double getRealMoney() {
        long daysLeft = ChronoUnit.DAYS.between(LocalDate.now(), getExpiryDate());
        if (daysLeft <= 5) {
            return getAmount() * 0.7;
        } else {
            return getAmount() * 0.9;
        }
    }
}

