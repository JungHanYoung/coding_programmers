package practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumDigitTest {

    @Test
    public void solution() {

        SumDigit sumDigit = new SumDigit();

        assertEquals(sumDigit.solution(123), 6);
        assertEquals(sumDigit.solution(987), 24);

    }
}