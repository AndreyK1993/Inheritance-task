import controller.ProductController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        double value = Double.parseDouble(sc.nextLine().trim());

        ProductController controller = new ProductController();

        controller.runApp(value);
    }
}
