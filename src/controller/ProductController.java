package controller;

import model.ProductModel;

import model.ProductA;

import model.ProductB;

import model.ProductC;

import utils.Rounder;

import view.ProductView;

public class ProductController {

    public void runApp(double value, int random) {
        ProductView view = new ProductView();
        ProductModel model = new ProductModel(value, random);
        ProductModel product;

        if (random < 3) {
            product = new ProductA(value, random);
        } else if (random >= 3 && random <= 7) {
            product = new ProductB(value, random);
        } else {
            product = new ProductC(value, random);
        }

        double winnings = product.calculateWinnings();
        String winningsFormatted = Rounder.roundValue(winnings);

        //view.getOutput(value, winningsFormatted, random) ;

        System.out.println("Value: " + value);
        System.out.println("Your winnings: " + winningsFormatted);
        System.out.println("Random: " + random);

    }

}