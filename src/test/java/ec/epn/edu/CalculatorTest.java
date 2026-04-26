package ec.epn.edu;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator c;

    @BeforeAll
    public static void setUpClass() {
        System.out.println("Starting tests for Calculator class...");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("setUp");
        c = new Calculator();
    }

    @Test
    public void given_two_integers_when_addition_then_ok() {
        assertEquals(6, c.addition(4, 2));
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok() {
        assertEquals(6, c.subtraction(8, 2));
    }

    @Test
    public void given_two_integers_when_division_then_exception() {
        assertThrows(ArithmeticException.class, () -> c.division(1, 0));
    }

    @Test
    @Timeout(1)
    public void given_a_time_when_timeout_then_ok() {
        c.timeout(100);
    }

    @AfterEach
    public void tearDown() {
        System.out.println("TearDown()");
        c.setAnswer(0);
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("All tests completed.");
    }
}