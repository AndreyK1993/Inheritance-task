package model;

import view.ProductView;

public class ProductModel {
    public double value;

    public ProductModel(double value) {
        this.value = value;
    }

    public double calculateWinnings() {
        return value * 1.25;
    }
}
