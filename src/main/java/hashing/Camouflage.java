package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Camouflage {

    public int solution(String[][] clothes) {
        int answer;
        // [ ["..", ".."], ["..", ".."] ]
        Map<String, List<String>> map = new HashMap<>();
        for(String[] strArr : clothes) {
//            strArr[0] : 옷이름
//            strArr[1] : 옷종류
            if(map.containsKey(strArr[1])) {
                List<String> temp = map.get(strArr[1]);
                temp.add(strArr[0]);
                map.put(strArr[1], temp);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(strArr[0]);
                map.put(strArr[1], temp);
            }
        }

        answer = map.values().stream()
                .mapToInt(val -> val.size() + 1)
                .reduce(1, (a, b) -> a * b);


        return answer-1;
    }
}
