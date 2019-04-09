package practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindKimTest {

    @Test
    public void solution() {

        FindKim findKim = new FindKim();
        
        assertEquals(findKim.solution(new String[]{"Jane", "Kim"}), "김서방은 1에 있다");
    }
}