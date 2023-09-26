import controller.ProductController;

public class Main {

    public static void main(String[] args) {

        int random = (int) (Math.random() * 10);

        double value = 10;

        ProductController controller = new ProductController();

        controller.runApp(value, random);
    }
}
