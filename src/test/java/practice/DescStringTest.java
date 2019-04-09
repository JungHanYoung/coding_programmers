package practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class DescStringTest {

    @Test
    public void solution() {

        DescString descString = new DescString();

        String zbcdefg = descString.solution("Zbcdefg");

        assertEquals(zbcdefg, "gfedcbZ");
    }
}