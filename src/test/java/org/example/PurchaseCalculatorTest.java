
package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PurchaseCalculatorTest {

    @Test
    public void testBelow1000() {
        double result =
                PurchaseCalculator.calculateFinalAmount(500);

        assertEquals(500.0, result, 0.01);
    }

    @Test
    public void testEqualTo1000() {
        double result =
                PurchaseCalculator.calculateFinalAmount(1000);

        assertEquals(900.0, result, 0.01);
    }

    @Test
    public void testAbove1000() {
        double result =
                PurchaseCalculator.calculateFinalAmount(1500);

        assertEquals(1350.0, result, 0.01);
    }
}
