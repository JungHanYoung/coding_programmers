package kakao2017;

import static org.junit.Assert.*;
import org.junit.Test;

public class SecretMapsTest {

    @Test
    public void solution() {
        SecretMaps secretMaps = new SecretMaps();
        assertArrayEquals(
                secretMaps.solution(5,
                new int[]{9, 20, 28, 18, 11},
                new int[]{30, 1, 21, 17, 28}),

                    new String[]{"#####", "# # #", "### #", "#  ##", "#####"});

        assertArrayEquals(secretMaps.solution(6,
                new int[]{46, 33, 33, 22, 31, 50},
                new int[]{27, 56, 19, 14, 14, 10}),

                new String[]{"######", "###  #", "##  ##", " #### ", " #####", "### # "});
    }
}