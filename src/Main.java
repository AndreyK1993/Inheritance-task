import controller.ProductController;

public class Main {

    public static void main(String[] args) {

        ProductController controller = new ProductController();

        double value = 10;

        int random = (int) (Math.random() * 10);

        controller.runApp(value, random);
    }
}
