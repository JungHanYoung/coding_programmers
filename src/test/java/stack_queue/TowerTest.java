package stack_queue;

import org.junit.Test;

import static org.junit.Assert.*;

public class TowerTest {

    @Test
    public void solution() {

        Tower tower = new Tower();

        tower.solution(new int[]{6,9,5,7,4});
        tower.solution(new int[]{3,9,9,3,5,7,2});
        tower.solution(new int[]{1,5,3,6,7,6,5});
    }
}