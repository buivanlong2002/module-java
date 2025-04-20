package minitest.mintest_5;

import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount {
    private int quantity;

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity * cost;
    }

    @Override
    public LocalDate getExpiryDate() {
        return manufacturingDate.plusYears(1);
    }

    @Override
    public double getRealMoney() {
        long monthsLeft = java.time.temporal.ChronoUnit.MONTHS.between(LocalDate.now(), getExpiryDate());
        if (monthsLeft <= 2) {
            return getAmount() * 0.6;
        } else if (monthsLeft <= 4) {
            return getAmount() * 0.8;
        } else {
            return getAmount() * 0.95;
        }
    }
}

