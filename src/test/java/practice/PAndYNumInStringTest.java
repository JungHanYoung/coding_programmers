package practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class PAndYNumInStringTest {

    @Test
    public void solution() {

        PAndYNumInString pAndYNumInString = new PAndYNumInString();

        boolean pPoooyY = pAndYNumInString.solution("pPoooyY");
        assertTrue(pPoooyY);

        boolean pyy = pAndYNumInString.solution("Pyy");
        assertFalse(pyy);
    }

}