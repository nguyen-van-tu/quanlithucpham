import java.time.LocalDate;

public class Meat extends Material {
    private double weight;

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }
    public Meat(){}


    public double getAmount() {
        return this.getCost() * this.weight;
    }

    public LocalDate getExpiryDate() {
        return this.getManufacturingDate().plusDays(7);
    }
    public double getRemainAmount() {
        if (this.getExpiryDate().compareTo(LocalDate.now().plusDays(3)) <= 0){
            return this.getAmount() * 0.5;
        }

        if (this.getExpiryDate().compareTo(LocalDate.now().plusDays(5)) <= 0){
            return this.getAmount() * 0.7;
        }
        return this.getAmount() * 0.9;
    }

}
