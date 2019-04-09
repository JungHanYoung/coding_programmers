package practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class HateSameNumberTest {

    @Test
    public void solution() {

        HateSameNumber hateSameNumber = new HateSameNumber();

        int[] result = hateSameNumber.solution(new int[]{1, 1, 3, 3, 0, 1, 1});

        assertArrayEquals(result, new int[]{1,3,0,1});

    }
}