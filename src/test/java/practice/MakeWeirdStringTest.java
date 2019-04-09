package practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class MakeWeirdStringTest {

    @Test
    public void solution() {

        MakeWeirdString makeWeirdString = new MakeWeirdString();

        assertEquals(makeWeirdString.solution("try hello world"), "TrY HeLlO WoRlD");
        assertEquals(makeWeirdString.solution("tr hello world"), "Tr HeLlO WoRlD");
    }
}