package practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarCipherTest {

    @Test
    public void solution() {

        CaesarCipher caesarCipher = new CaesarCipher();

        assertEquals(caesarCipher.solution("AB", 1), "BC");

        assertEquals(caesarCipher.solution("z", 1), "a");

        assertEquals(caesarCipher.solution("a B z", 4), "e F d");
    }
}