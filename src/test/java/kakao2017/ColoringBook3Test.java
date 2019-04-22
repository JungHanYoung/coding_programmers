package kakao2017;

import org.junit.Test;

import static org.junit.Assert.*;

public class ColoringBook3Test {

    @Test
    public void solution() {

        ColoringBook3 cb = new ColoringBook3();



        assertArrayEquals(cb.solution(6,4,
                new int[][]{
                        {1,1,1,0},
                        {1,2,2,0},
                        {1,0,0,1},
                        {0,0,0,1},
                        {0,0,0,3},
                        {0,0,0,3}
                }), new int[]{4,5});
    }
}