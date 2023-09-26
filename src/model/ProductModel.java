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
        if (random < 3) {
            return value * 1.25;
        } else if (random >= 3 && random <= 7) {
            double winningsBeforeFee = value * 1.25;
            return winningsBeforeFee - (0.05 * value);
        } else if (random > 7) {
            double winningsBeforeFee = value * 1.25;
            return (winningsBeforeFee - (0.10 * winningsBeforeFee)) * 2;
        }
        return 0;
    }
}
