package enumy.zadanie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private Product product;

    @BeforeEach
    void setUp() {
        product = new Product();
    }

    @ParameterizedTest
    @CsvSource(value = {
            "Jabłko,10,1,OWOCE",
            "Gruszka,11,2,OWOCE",
            "Pietruszka,1,1,WARZYWA",
    })
    void testCzyDobrzeTworzyProductIGoZwraca(String name, double price, double weight, ProductType productType){
        product.setName(name);
        product.setPrice(price);
        product.setWeight(weight);
        product.setProductType(productType);

        Product product2 = new Product();
        product2.setName(product.getName());
        product2.setPrice(product.getPrice());
        product2.setWeight(product.getWeight());
        product2.setProductType(product.getProductType());

        assertEquals(product.getName(), product2.getName());
        assertEquals(product.getPrice(), product2.getPrice());
        assertEquals(product.getWeight(), product2.getWeight());
        assertEquals(product.getProductType(), product2.getProductType());

    }
}