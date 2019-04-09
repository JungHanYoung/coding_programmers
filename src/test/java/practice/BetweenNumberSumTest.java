package practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class BetweenNumberSumTest {

    @Test
    public void solution() {

        BetweenNumberSum betweenNumberSum = new BetweenNumberSum();

        long num = betweenNumberSum.solution(3, 5);

        assertEquals(num, 12);

        long num2 = betweenNumberSum.solution(3, 3);

        assertEquals(num2, 3);

        long num3 = betweenNumberSum.solution(5, 3);

        assertEquals(num3, 12);
    }
}