package practice;

import java.util.ArrayList;
import java.util.List;

public class IntervalNumArray {

    public long[] solution(int x, int n) {

        List<Long> list = new ArrayList<>(n);

        long accu = 0L;
        while(list.size() < n) {
            accu += x;
            list.add(accu);
        }

        long[] answer = new long[n];

        for(int i = 0; i < n; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
