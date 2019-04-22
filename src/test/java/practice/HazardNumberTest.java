package practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class HazardNumberTest {

    @Test
    public void solution() {

        HazardNumber hn = new HazardNumber();



        assertTrue(hn.solution(10));
        assertTrue(hn.solution(12));
        assertFalse(hn.solution(11));
        assertFalse(hn.solution(13));

    }
}