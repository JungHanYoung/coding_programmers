package stack_queue;

import org.junit.Test;

import static org.junit.Assert.*;

public class StealbarTest {

    @Test
    public void solution() {

        Stealbar stealbar = new Stealbar();

        int result = stealbar.solution("()(((()())(())()))(())");
        assertEquals(result, 17);
    }
}