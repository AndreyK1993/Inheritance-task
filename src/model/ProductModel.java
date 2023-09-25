package model;

import entity.Product;

public class ProductModel {
    private double value;

    public ProductModel(double value) {
        this.value = value;
    }
    public double calculateWinnings() {

        return value * 1.25;
    }

}
