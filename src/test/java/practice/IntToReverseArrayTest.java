package practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntToReverseArrayTest {

    @Test
    public void solution() {

        IntToReverseArray intToReverseArray = new IntToReverseArray();

        assertArrayEquals(intToReverseArray.solution(12345), new int[]{5,4,3,2,1});

    }
}