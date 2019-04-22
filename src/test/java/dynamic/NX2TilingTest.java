package dynamic;

import org.junit.Test;

import static org.junit.Assert.*;

public class NX2TilingTest {

    @Test
    public void solution() {

        NX2Tiling tiling = new NX2Tiling();

        assertEquals(tiling.solution(4), 5);
    }
}