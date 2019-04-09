package practice;

import java.util.ArrayList;
import java.util.List;

public class HateSameNumber {


    public int[] solution(int[] arr) {

        int memory = -1;
        List<Integer> answerTemp = new ArrayList<>();
        for(int num : arr) {
            if(num != memory) {
                answerTemp.add(num);
                memory = num;
            }
        }

        int[] answer = new int[answerTemp.size()];

        for(int i = 0; i < answerTemp.size(); i++) {
            answer[i] = answerTemp.get(i);
        }

        return answer;
    }
}
