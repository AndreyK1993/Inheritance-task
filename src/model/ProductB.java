package model;

public class ProductB extends ProductModel {
    public ProductB(double value, int random) {
        super(value, random);
    }

    @Override
    public double calculateWinnings() {
        if (random >= 3 && random <= 7) {
            double winningsBeforeFee = value * 1.25;
            return winningsBeforeFee - (0.05 * value);
        } else {
            return 0;
        }
    }
}
