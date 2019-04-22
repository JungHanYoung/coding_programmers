package practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntervalNumArrayTest {

    @Test
    public void solution() {

        IntervalNumArray intervalNumArray = new IntervalNumArray();
        assertArrayEquals(intervalNumArray.solution(2, 5), new long[]{2,4,6,8,10});
        assertArrayEquals(intervalNumArray.solution(4, 3), new long[]{4,8,12});
        assertArrayEquals(intervalNumArray.solution(-4, 2), new long[]{-4,-8});

    }
}