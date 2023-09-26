package model;

public class ProductC extends ProductModel {

    public ProductC(double value) {
        super(value);
    }

    @Override
    public double calculateWinnings() {
        if (value > 7) {
            double winningsBeforeFee = super.calculateWinnings();
            return (winningsBeforeFee - (0.10 * winningsBeforeFee)) * 2;
        } else {
            return super.calculateWinnings();
        }

    }
}
