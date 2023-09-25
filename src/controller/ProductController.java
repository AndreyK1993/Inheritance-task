package controller;

import entity.Product;
import model.ProductModel;
import utils.Rounder;
import view.ProductView;

public class ProductController {

    public void runApp() {
        ProductView view = new ProductView();
        ProductModel model = new ProductModel();

        Product product = convertData(view.getData());

        view.getOutput(formOutput(product.getName(),
                Rounder.roundValue
                        (model.calculateWinnings(product))));
    }

    private String formOutput(String cost) {


    }

    private Product convertData(String[] data) {
        return new Product(data[0], Integer.parseInt(data[1]),
                Double.parseDouble(data[2]));
    }

    Product product;

        if(value< 3)

    {
        product = new ProductA(value);
    } else if(value >=3&&value <=7)

    {
        product = new ProductB(value);
    } else

    {
        product = new ProductC(value);
    }

    double winnings = product.calculateWinnings();

        System.out.println("Your winnings: "+winnings);

}
}