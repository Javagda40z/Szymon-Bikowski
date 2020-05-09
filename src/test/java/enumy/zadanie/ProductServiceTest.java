package enumy.zadanie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {
    List<Product> owoce;

    @BeforeEach
    void setUp() {
        owoce = new ArrayList<>();
    }

    @Test
    void retrieveFruitsWhenOwoce() {
        Product jablko = new Product();
        jablko.setName("Jabłko");
        jablko.setPrice(10);
        jablko.setWeight(1);
        jablko.setProductType(ProductType.OWOCE);
        owoce.add(jablko);

        assertEquals(ProductType.OWOCE, jablko.getProductType());

    }
}