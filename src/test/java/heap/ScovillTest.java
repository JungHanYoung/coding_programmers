package heap;

import org.junit.Test;

import static org.junit.Assert.*;

public class ScovillTest {

    @Test
    public void solution() {
        Scovill scovill = new Scovill();

        scovill.solution(new int[]{1, 2, 3, 9, 10, 12}, 7);
        scovill.solution(new int[]{1, 2, 3, 9, 10, 12}, 1000);
        scovill.solution(new int[]{1, 2, 3, 9, 10, 12}, 35);
        scovill.solution(new int[]{1, 2, 3, 9, 10, 12}, 20);
        scovill.solution(new int[]{1}, 10);
        scovill.solution(new int[]{}, 0);
    }
}