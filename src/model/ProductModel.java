import entity.Product;

public class ProductA extends Product {
    public ProductA(double value) {

        super(value);
    }

    @Override
    public double calculateWinnings() {
        if (value < 3) {
            return value * 1.25;
        } else {
            return super.calculateWinnings();
        }
    }
}

public class ProductB extends Product {
    public ProductB(double value) {
        super(value);
    }

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

public class ProductC extends Product {
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