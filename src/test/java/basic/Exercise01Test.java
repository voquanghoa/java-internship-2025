package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise01Test {
    @Test
    void shouldSumDigits_OK() {
        final Exercise01 exercise01 = new Exercise01();
        assertEquals(2, exercise01.GCD(2,4));
        assertEquals(1, exercise01.GCD(2,3));
        assertEquals(6, exercise01.LCM(2,3));
        assertEquals(12, exercise01.LCM(3,4));

    }
}
