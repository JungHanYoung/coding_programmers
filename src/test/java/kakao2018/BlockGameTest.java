package kakao2018;

import org.junit.Test;

import static org.junit.Assert.*;

public class BlockGameTest {

    @Test
    public void solution() {

        BlockGame blockGame = new BlockGame();

        int result = blockGame.solution(new int[][]{
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,4,0,0,0},
                {0,0,0,0,0,4,4,0,0,0},
                {0,0,0,0,3,0,4,0,0,0},
                {0,0,0,2,3,0,0,0,5,5},
                {1,2,2,2,3,3,0,0,0,5},
                {1,1,1,0,0,0,0,0,0,5}
        });

        assertEquals(result , 2);
    }
}