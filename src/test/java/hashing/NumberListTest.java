package hashing;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberListTest {

    /**
     *
     * 입출력 예제
     * phone_book	                return
     * [119, 97674223, 1195524421]	false
     * [123,456,789]	            true
     * [12,123,1235,567,88]	        false
     *
     */
    @Test
    public void solution() {
        NumberList numberList = new NumberList();
        assertTrue(numberList.solution(new String[]{"123", "456", "789"}));
        assertFalse(numberList.solution(new String[]{"12", "123", "1235", "567", "88"}));
        assertFalse(numberList.solution(new String[]{"911", "97625999", "91125426"}));
        assertTrue(numberList.solution(new String[]{"113", "12340", "123440", "12345", "98346"}));
        assertFalse(numberList.solution(new String[]{"12232332", "12", "222222"}));
        assertFalse(numberList.solution(new String[]{"119", "97674223", "1195524421"}));

    }
}