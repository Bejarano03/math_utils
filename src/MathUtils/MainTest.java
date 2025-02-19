package MathUtils;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void addition() {
        assertEquals(8, MathUtils.Add(3, 5));
    }

    @Test
    public void subtraction() {
        assertEquals(-2, MathUtils.Subtract(3, 5));
    }

    @Test
    public void multiplication() {
        assertEquals(15.0, MathUtils.Multiply(3, 5));
    }

    @Test
    public void division() {
        assertEquals(0.6, MathUtils.Divide(3, 5));
    }

}