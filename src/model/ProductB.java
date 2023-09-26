package model;

public class ProductB extends ProductModel {
    public ProductB(double value, int random) {
        super(value, random);
    }

    @Override
    public double calculateWinnings() {
        if (random >= 3 && random <= 7) {
            double winningsBeforeFee = super.calculateWinnings();
            return winningsBeforeFee - (0.05 * value);
        } else {
            return 0;
        }
    }
}
