package hashing;

import org.junit.Test;

import static org.junit.Assert.*;

public class hashing1Test {

    /**
     * 입출력 예****
     *
     * participant	                            completion	                        return
     * -------------------------------------------------------------------------------------
     * [leo, kiki, eden]	                    [eden, kiki]	                    leo
     * [marina, josipa, nikola, vinko, filipa]	[josipa, filipa, marina, nikola]	vinko
     * [mislav, stanko, mislav, ana]	        [stanko, ana, mislav]	            mislav
     */

    @Test
    public void solution() {
        Hashing hashing = new Hashing();

        assertEquals(hashing.solution(
                new String[]{"leo", "kiki", "eden"},
                new String[]{"eden", "kiki"}), "leo");

        assertEquals(hashing.solution(
                new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
                new String[]{"josipa", "filipa", "marina", "nikola"}), "vinko");

        assertEquals(hashing.solution(
                new String[]{"mislav", "stanko", "mislav", "ana"},
                new String[]{"stanko", "ana", "mislav"}), "mislav");


    }
}