package ec.epn.edu.git.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorParametersTest {

    @ParameterizedTest
    @CsvSource({
            "2,  4,  6",
            "1,  8,  9",
            "2,  5,  7",
            "7,  3,  10",
            "22, 4,  26",
            "12, 14, 26"
    })
    public void given_parameters_when_addition_then_summation(int a, int b, int expected) {
        Calculator c = new Calculator();
        int actual = c.addition(a, b);
        assertEquals(expected, actual);
    }
}