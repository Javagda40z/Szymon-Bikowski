package doTestow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class TestSqrt {
    private Sqrt sqrt;

    @BeforeEach
    void setUp(){
        sqrt = new Sqrt();
    }

    @ParameterizedTest
    @CsvSource(value = {
            "9,3",
            "25,5",
            "81,9"
    })
    void testSqrtValue(double val1, double result){
        double actual = sqrt.sqrtValue(val1);
        assertEquals(result,actual);
        assertNotNull(actual);
    }

    @Test
    void testZero(){
        assertEquals(0,sqrt.sqrtValue(0));
    }

    @Test
    void testMinus(){
        assertEquals(Double.NaN,sqrt.sqrtValue(-1));
    }

}
