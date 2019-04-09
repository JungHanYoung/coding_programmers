package practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class AverageTest {

    @Test
    public void solution() {
        Average average = new Average();
        double result1 = average.solution(new int[]{1,2,3,4});
        double result2 = average.solution(new int[]{5,5});

        System.out.println(result1 + ", " + result2);

        assertEquals(average.solution(new int[]{1,2,3,4}), 2.5, 0);
        assertEquals(average.solution(new int[]{5,5}), 5, 0);
    }
}