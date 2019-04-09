package practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringHandlingFoundationTest {

    @Test
    public void solution() {

        StringHandlingFoundation stringHandlingFoundation = new StringHandlingFoundation();

        assertFalse(stringHandlingFoundation.solution("a234"));

        assertTrue(stringHandlingFoundation.solution("1234"));
    }
}