package controller;

import model.ProductModel;
import utils.Rounder;
import view.ProductView;

public class ProductController {

    public void runApp(double value, int random) {
        ProductView view = new ProductView();
        ProductModel model = new ProductModel(value, random);

        double winnings = model.calculateWinnings();
        String winningsFormatted = Rounder.roundValue(winnings);

        view.getOutput(winningsFormatted);

        System.out.println("Your winnings: " + winningsFormatted);
        System.out.println("Random: " + random);

    }

}