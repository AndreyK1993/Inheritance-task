package controller;

import entity.Product;
import model.ProductModel;
import utils.Rounder;
import view.ProductView;

public class ProductController {

    public void runApp() {

        Product product;

        if (value < 3) {
            product = new ProductA(value);
        } else if (value >= 3 && value <= 7) {
            product = new ProductB(value);
        } else {
            product = new ProductC(value);
        }

        double winnings = product.calculateWinnings();

        System.out.println("Your winnings: " + winnings);


    }


}