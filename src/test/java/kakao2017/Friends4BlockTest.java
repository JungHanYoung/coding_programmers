package kakao2017;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class Friends4BlockTest {

    @Test
    @Ignore // TODO: Error (무한 루프)
    public void solution() {
        Friends4Block friends4Block = new Friends4Block();
        assertEquals(friends4Block.solution(4, 5,
                new String[]{"CCBDE", "AAADE", "AAABF", "CCBBF"}), 14);
        assertEquals(friends4Block.solution(6, 6,
                new String[]{"TTTANT", "RRFACC", "RRRFCC",
                        "TRRRAA", "TTMMMF", "TMMTTJ"}), 15);
    }
}