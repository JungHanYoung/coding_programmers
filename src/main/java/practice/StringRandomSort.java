package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringRandomSort {

    public String[] solution(String[] strings, int n) {

        Arrays.sort(strings, (s1, s2) -> s1.charAt(n) == s2.charAt(n) ? s1.compareTo(s2) : s1.charAt(n) - s2.charAt(n));
//        Arrays.sort(strings, Comparator.comparingInt(s -> s.charAt(n)));

//        List<String> answerTemp = new ArrayList<>(Arrays.asList(strings));
//
//        answerTemp.sort(Comparator.comparingInt(s -> s.charAt(n)));
//
//        String[] answer = new String[answerTemp.size()];

        return strings;
    }
}
