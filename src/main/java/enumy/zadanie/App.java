package enumy.zadanie;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Product product = new Product();
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();

        product.setName("Jabłko");
        product.setPrice(10);
        product.setProductType(ProductType.OWOCE);
        product.setWeight(1);

        product3.setName("Pomoarańcz");
        product3.setPrice(10);
        product3.setProductType(ProductType.OWOCE);
        product3.setWeight(1);

        product1.setName("Gruszka");
        product1.setPrice(17);
        product1.setProductType(ProductType.OWOCE);
        product1.setWeight(1);

        product2.setName("Kapusta");
        product2.setPrice(15);
        product2.setProductType(ProductType.WARZYWA);
        product2.setWeight(3);


        for (ProductType element : ProductType.values()) {
            System.out.println("Produkt: " + element + " ma kod: " + element.getCode());
        }

        System.out.println("");

        List<Product> owoce = ProductService.retrieveFruits(Arrays.asList(product3, product, product1, product2));
        for (Product element : owoce) {
            System.out.println(element.getProductType() + " " + element.getName() + " Cena: " + element.getPrice() + " Waga: " + element.getWeight());
        }


    }
}
