package enumy.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {

    @Test
    public void testPlusOperation() {
        assertEquals(10,Operation.PLUS.calculate(5, 5));
        assertEquals(3,Operation.PLUS.calculate(1.5, 1.5));
        assertEquals(20,Operation.PLUS.calculate(16, 4));
        assertEquals(0,Operation.PLUS.calculate(0, 0));
        assertEquals(20,Operation.PLUS.calculate(-100000000, 100000020));

    }

    @Test
    public void testMinusOperation() {
        assertEquals(0,Operation.MINUS.calculate(5,5));
        assertEquals(9,Operation.MINUS.calculate(12,3));
        assertEquals(5.5,Operation.MINUS.calculate(6,0.5));
    }

    @Test
    public void testWhenDefaultOperationThenThrowError(){
        assertThrows(AssertionError.class, () -> Operation.DODATKOWA_OPERACJA.calculate(5,5));
    }

}