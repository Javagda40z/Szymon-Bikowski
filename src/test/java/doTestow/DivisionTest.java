package doTestow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {

    private Division division;

    @BeforeEach
    void setUp() {
        division = new Division();
    }

    @ParameterizedTest
    @CsvSource(value =
            {
                    "2,2,1",
                    "25,5,5",
                    "16,-8,-2"
            })
    void testDivisionValue(int val1, int val2, double result) {
        double actual = division.divisionValue(val1,val2);
        assertEquals(result,actual);
        assertNotNull(actual);
    }

    @Test
    void testZero() {
        assertThrows(ArithmeticException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                division.divisionValue(5, 0);
            }
        });
    }
}
