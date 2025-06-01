package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProblemTest {

    @Test
    public void testNonEmptyResultIfFits() {
        Problem p = new Problem(5, 123, 1, 10);
        Result r = p.solve(50);
        assertTrue(r.totalWeight > 0, "Should return non-zero weight when items fit");
    }

    @Test
    public void testEmptyResultIfNothingFits() {
        Problem p = new Problem(5, 123, 10, 10); // all items weight 10
        Result r = p.solve(5); // capacity too small
        assertEquals(0, r.totalWeight, "Should return empty result");
    }

    @Test
    public void testAllItemsInRange() {
        Problem p = new Problem(20, 111, 1, 10);
        for (Item item : p.getItems()) {
            assertTrue(item.weight >= 1 && item.weight <= 10);
            assertTrue(item.value >= 1 && item.value <= 10);
        }
    }

    @Test
    public void testKnownInstance() {
        Problem p = new Problem(1, 0, 5, 5); // always generates 1 item of weight/value 5
        Result r = p.solve(20);
        assertEquals(20, r.totalWeight);
        assertEquals(20, r.totalValue);
    }
}
