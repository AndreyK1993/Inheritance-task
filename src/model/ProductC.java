package model;

public class ProductC extends ProductModel {

    public ProductC(double value, int random) {
        super(value, random);
    }

    @Override
    public double calculateWinnings() {
        if (random > 7) {
            double winningsBeforeFee = value * 1.25;
            return (winningsBeforeFee - (0.10 * winningsBeforeFee)) * 2;
        } else {
            return 0;
        }

    }
}
