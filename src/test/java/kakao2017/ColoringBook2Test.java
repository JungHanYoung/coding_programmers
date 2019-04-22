package kakao2017;

import org.junit.Test;

import static org.junit.Assert.*;

public class ColoringBook2Test {

    @Test
    public void solution() {

        ColoringBook2 cb = new ColoringBook2();

        assertArrayEquals(cb.solution(6, 4,
                new int[][]{
                        {1,1,1,0},
                        {1,2,2,0},
                        {1,0,0,1},
                        {0,0,0,1},
                        {0,0,0,3},
                        {0,0,0,3}
                }), new int[]{14,5});
    }
}