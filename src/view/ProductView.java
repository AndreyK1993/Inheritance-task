package view;

import java.util.Scanner;

public class ProductView {

    public String[] getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        String value = sc.nextLine().trim();
        return new String[]{value};
    }

    public void getOutput(String output) {

        System.out.println(output);
    }
}