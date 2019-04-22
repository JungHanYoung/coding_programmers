package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntToReverseArray {

    public int[] solution(long n) {

        String s = Long.toString(n);

        List<Integer> integers = new ArrayList<>();
        for(char c : s.toCharArray()) {
            integers.add(c - '0');
        }
        Collections.reverse(integers);
        int[] answer = new int[integers.size()];

        for(int i = 0; i < answer.length; i++)
            answer[i] = integers.get(i);

        return answer;
    }
}
