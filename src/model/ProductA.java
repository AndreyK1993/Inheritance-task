package model;

public class ProductA extends ProductModel {

    @Override
    public double calculateWinnings() {
        if (value < 3) {
            return value * 1.25;
        } else {
            return super.calculateWinnings();
        }
    }
}
