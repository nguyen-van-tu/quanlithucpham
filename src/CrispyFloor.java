import java.time.LocalDate;

public class CrispyFloor extends Material {
    private double quantity;

    public CrispyFloor() {
    }

    public CrispyFloor(String id, String name, LocalDate manufacturingDate, int cost, double quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }


    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public double getAmount() {
        return this.getCost() * this.getQuantity();
    }

    @Override
    public LocalDate getExpiryDate() {
        return this.getManufacturingDate().plusYears(1);
    }

    public double getRemainAmount() {
        if (this.getExpiryDate().compareTo(LocalDate.now().plusMonths(2)) <= 0){
            return this.getAmount() * 0.6;
        }

        if (this.getExpiryDate().compareTo(LocalDate.now().plusMonths(4)) <= 0){
           return this.getAmount() * 0.8;
        }

        return this.getAmount() * 0.95;
    }
}