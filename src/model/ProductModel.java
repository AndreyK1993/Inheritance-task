package model;

import view.ProductView;

public class ProductModel {
    public double value;
    public int random;

    public ProductModel(double value, int random) {
        this.value = value;
        this.random = random;
    }

    public double calculateWinnings() {

            return value * 1.25;

    }
}
