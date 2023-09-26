import controller.ProductController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //double value=100;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        double value = Double.parseDouble(sc.nextLine().trim());

        int random = (int) (Math.random() * 10);

        ProductController controller = new ProductController();

        controller.runApp(value, random);
    }
}
