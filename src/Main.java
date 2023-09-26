import controller.ProductController;

public class Main {

    public static void main(String[] args) {

        ProductController controller = new ProductController();

        double value = 100;

        int random = (int) (Math.random() * 10);

        controller.runApp(value, random);
    }
}
