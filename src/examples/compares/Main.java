package compares;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();

        products.add(new Product("Milk", 200));
        products.add(new Product("Bread", 100));
        products.add(new Product("Bread", 200));
        products.add(new Product("Oil", 600));
        products.add(new Product("Alcohol", 1200));

        System.out.println(products);

        Collections.sort(products);

        System.out.println(products);

        Collections.sort(products, new Comparator<Product>() {
            public int compare(Product prod1, Product prod2) {
                if (prod1.getPrice() > prod2.getPrice()) {
                    return 10;
                } else if (prod1.getPrice() < prod2.getPrice()) {
                    return -10000;
                } else {
                    return 0;
                }
            }
        });


        System.out.println(products);
    }
}
