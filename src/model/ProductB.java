package model;

public class ProductB extends ProductModel {

    @Override
    public double calculateWinnings() {
        if (value >= 3 && value <= 7) {
            double winningsBeforeFee = super.calculateWinnings();
            return winningsBeforeFee - (0.05 * value);
        } else {
            return super.calculateWinnings();
        }
    }
}
