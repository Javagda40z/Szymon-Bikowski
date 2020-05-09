package enumy.zadanie;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProductService {

    public static List<Product> retrieveFruits(List<Product> products) {
        List<Product> owoce = new ArrayList<>();

        for (Product product : products) {
            if (product.getProductType() == ProductType.OWOCE) {
                owoce.add(product);
            }
        }
        return owoce;
    }

}
