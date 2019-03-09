package kakao2017;

import org.junit.Test;

import static org.junit.Assert.*;

public class CacheTest {

    @Test
    public void solutionTest() {
        /**
         * 캐시크기(cacheSize)	도시이름(cities)	                                                                            실행시간
         * 3	            [Jeju, Pangyo, Seoul, NewYork, LA, Jeju, Pangyo, Seoul, NewYork, LA]	                    50
         * 3	            [Jeju, Pangyo, Seoul, Jeju, Pangyo, Seoul, Jeju, Pangyo, Seoul]	                            21
         * 2	            [Jeju, Pangyo, Seoul, NewYork, LA, SanFrancisco, Seoul, Rome, Paris, Jeju, NewYork, Rome]	60
         * 5	            [Jeju, Pangyo, Seoul, NewYork, LA, SanFrancisco, Seoul, Rome, Paris, Jeju, NewYork, Rome]	52
         * 2	            [Jeju, Pangyo, NewYork, newyork]	                                                        16
         * 0	            [Jeju, Pangyo, Seoul, NewYork, LA]	                                                        25
         */
        Cache cache = new Cache();

        assertEquals(cache.solution(3,
                new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA",
                        "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}), 50);

        assertEquals(cache.solution(3,
                new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo",
                        "Seoul", "Jeju", "Pangyo", "Seoul"}), 21);

        assertEquals(cache.solution(2,
                new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA",
                        "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju",
                        "NewYork", "Rome"}), 60);

        assertEquals(cache.solution(5,
                new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA",
                        "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju",
                        "NewYork", "Rome"}), 52);

        assertEquals(cache.solution(2,
                new String[]{"Jeju", "Pangyo", "NewYork", "newyork"}), 16);

        assertEquals(cache.solution(0,
                new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"}), 25);

    }

}