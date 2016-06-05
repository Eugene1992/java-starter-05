package compares;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

    }

    public static List<Product> filterByAge(List<Product> products, int from, int to){
        List<Product> result = new ArrayList<Product>();
        /*for (Product product : products) {
            if (product.getPrice() < to && product.getPrice() > from) {
                result.add(product);
            }
        }*/
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getPrice() < to && products.get(i).getPrice() > from) {
                result.add(products.get(i));
            }
        }
        return result;
    }
}
