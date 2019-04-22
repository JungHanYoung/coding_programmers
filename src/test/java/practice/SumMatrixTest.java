package practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumMatrixTest {

    @Test
    public void solution() {

        /**
         * [[1, 2], [2, 3]], [[3, 4], [5, 6]]
         * 기댓값 〉	[[4, 6], [7, 9]]
         */

        SumMatrix sm = new SumMatrix();


        assertArrayEquals(
                sm.solution(
                        new int[][]{
                                {1,2},
                                {2,3}
                        },
                        new int[][]{
                                {3,4},
                                {5,6}
                        }),
                new int[][]{
                        {4,6},
                        {7,9}
                }
        );
    }
}