package doTestow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


public class PowerTest {
    private Power power;

    @BeforeEach
    void setUp() {
        power = new Power();
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "5,3,125",
                    "16,10,1099511627776",
                    "3,0,1"
            }
    )
    void happyPath(int values, int pow, long result) {

        assertDoesNotThrow(new Executable() {
            @Override
            public void execute() throws Throwable {
                long actual = power.powValues(values, pow);
                assertEquals(result, actual);
                assertNotNull(actual);
            }
        });
    }

    @Test
    void negativePower() {
        assertThrows(
                IllegalArgumentException.class,
                new Executable() {
                    @Override
                    public void execute() throws Throwable {
                        long actual = power.powValues(1, -1);
                    }
                });
    }
}
