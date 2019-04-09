package practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class AvailableDivideNumArrayTest {

    @Test
    public void solution() {

        AvailableDivideNumArray availableDivideNumArray = new AvailableDivideNumArray();

        int[] result = availableDivideNumArray.solution(new int[]{5,9,7,10}, 5);

        assertArrayEquals(result, new int[]{5, 10});
    }
}