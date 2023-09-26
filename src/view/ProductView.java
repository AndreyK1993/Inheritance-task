package view;

import java.util.Scanner;

public class ProductView {

    public String[] getData() {
        int random = (int) (Math.random() * 10);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        String value = sc.nextLine().trim();
        return new String[]{value};
    }

    public void getOutput(String output) {

        System.out.println(output);
    }
}