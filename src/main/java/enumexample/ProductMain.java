package enumexample;

import java.util.ArrayList;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) {
//        for(ProductType productType : ProductType.values()) {
//            System.out.println(productType);
//        }
        List<Product> products = new ArrayList<>();
        products.add(new Product("Orange",1.20,0.20,ProductType.OWOCE));
        products.add(new Product("BAnana",2.20,0.60,ProductType.OWOCE));
        products.add(new Product("Cola",1.20,0.20,ProductType.NAPOJE));
        products.add(new Product("Orangadee",1.20,0.20,ProductType.NAPOJE));

        System.out.println(ProductService.retrieveFruits(products));
    }
}
