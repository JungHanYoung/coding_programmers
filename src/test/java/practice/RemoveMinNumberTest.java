package practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveMinNumberTest {

    @Test
    public void solution() {

        RemoveMinNumber rmn = new RemoveMinNumber();

        assertArrayEquals(rmn.solution(new int[]{4,3,2,1}), new int[]{4,3,2});
        assertArrayEquals(rmn.solution(new int[]{10}), new int[]{-1});

    }
}