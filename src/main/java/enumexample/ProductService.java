package enumexample;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    public static List<Product> retrieveFruits(List<Product> products) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getProductType().equals(ProductType.OWOCE)) {
                result.add(product);
            }
        }
        return result;
    }

}
