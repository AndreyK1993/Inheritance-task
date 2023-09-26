package model;

public class ProductA extends ProductModel {
    public ProductA(double value, int random) {
        super(value, random);
    }

    @Override
    public double calculateWinnings() {
        if (random < 3) {
            return value * 1.25;
        } else {
            return super.calculateWinnings();
        }
    }
}
