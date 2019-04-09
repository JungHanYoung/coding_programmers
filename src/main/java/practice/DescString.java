package practice;

import java.util.ArrayList;
import java.util.List;

public class DescString {

    public String solution(String s) {

        List<Character> list = new ArrayList<>();


        for(char c : s.toCharArray())
            list.add(c);

        list.sort((c1, c2) -> c2 - c1);

        StringBuilder sb = new StringBuilder();

        for(char c : list)
            sb.append(c);

        return sb.toString();

    }
}
