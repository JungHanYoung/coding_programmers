package hashing;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class 완주하지못한선수 {

    public static void main(String[] args) {

        System.out.println(
                solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"})
        );
        System.out.println(
                solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"})
        );
        System.out.println(
                solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"})
        );

    }

    public static String solution(String[] participant, String[] completion) {

        Map<String, Integer> map = new HashMap<>();

        for(String part : participant) {
            map.put(part, map.getOrDefault(part, 1));
        }

        for(String comp : completion) {
            if(map.containsKey(comp)) {
                map.put(comp, map.get(comp) - 1);
            } else {
                return comp;
            }
        }

        AtomicReference<String> answer = new AtomicReference<>();
        map.forEach((k, v) -> {
            if(v > 0)
                answer.set(k);
        });

        return answer.get();

    }
}
