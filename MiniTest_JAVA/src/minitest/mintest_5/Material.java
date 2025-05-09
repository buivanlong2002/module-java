package minitest.mintest_5;

import java.time.LocalDate;

public abstract class Material {
    protected String id;
    protected String name;
    protected LocalDate manufacturingDate;
    protected int cost;

    public Material(String id, String name, LocalDate manufacturingDate, int cost) {
        this.id = id;
        this.name = name;
        this.manufacturingDate = manufacturingDate;
        this.cost = cost;
    }

    public abstract double getAmount();
    public abstract LocalDate getExpiryDate();

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public LocalDate getManufacturingDate() { return manufacturingDate; }
    public void setManufacturingDate(LocalDate manufacturingDate) { this.manufacturingDate = manufacturingDate; }

    public int getCost() { return cost; }
    public void setCost(int cost) { this.cost = cost; }
}
