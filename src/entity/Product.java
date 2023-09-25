package entity;

public class Product {

    private double value;

    public Product (double value) {
        this.value = value;
    }

    public double calculateWinnings() {

        return value * 1.25;
    }
}
