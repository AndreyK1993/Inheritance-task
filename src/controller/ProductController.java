package controller;

import model.ProductModel;
import utils.Rounder;
import view.ProductView;

public class ProductController {

    public void runApp(double value) {
        ProductView view = new ProductView();
        ProductModel model = new ProductModel(value);

        double winnings = model.calculateWinnings();
        String winningsFormatted = Rounder.roundValue(winnings);

        view.getOutput(winningsFormatted);

        System.out.println("Your winnings: " + winningsFormatted);

    }
}