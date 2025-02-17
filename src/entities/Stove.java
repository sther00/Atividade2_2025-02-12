package entities;

public class Stove extends Product {
    private int burners;

    public Stove(String brand, double price, int burners) {
        super(brand, price);
        this.burners = burners;
    }

    public int getBurners() {
        return burners;
    }

    @Override
    public String toString() {
        return super.toString() + ", Burners: " + burners;
    }
}

