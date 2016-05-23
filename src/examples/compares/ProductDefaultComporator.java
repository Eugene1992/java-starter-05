package compares;

import java.util.Comparator;

public class ProductDefaultComporator implements Comparator<Product>{
    public int compare(Product prod1, Product prod2) {
        if (prod1.getPrice() > prod2.getPrice()) {
            return 10;
        } else if (prod1.getPrice() < prod2.getPrice()) {
            return -10000;
        } else {
            return 0;
        }
    }
}
