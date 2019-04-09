package practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindPrimeNumbersTest {

    @Test
    public void solution() {

        FindPrimeNumbers findPrimeNumbers = new FindPrimeNumbers();

        assertEquals(findPrimeNumbers.solution2(10), 4);

        assertEquals(findPrimeNumbers.solution2(5), 3);
    }

}