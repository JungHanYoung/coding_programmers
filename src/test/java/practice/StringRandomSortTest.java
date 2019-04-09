package practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringRandomSortTest {

    @Test
    public void solution() {

        StringRandomSort stringRandomSort = new StringRandomSort();

        String[] result = stringRandomSort.solution(new String[]{"sun", "bed", "car"}, 1);

        assertArrayEquals(result, new String[]{"car", "bed", "sun"});

        String[] result2 = stringRandomSort.solution(new String[]{"abce", "abcd", "cdx"}, 2);

        assertArrayEquals(result2, new String[]{"abcd", "abce", "cdx"});
    }
}