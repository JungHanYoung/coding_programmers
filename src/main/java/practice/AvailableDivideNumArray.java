package practice;

import java.util.ArrayList;
import java.util.List;

public class AvailableDivideNumArray {

    public int[] solution(int[] arr, int dividor) {

        List<Integer> answerTemp = new ArrayList<>();
        for(int num : arr) {
            if(num % dividor == 0)
                answerTemp.add(num);
        }

        if(answerTemp.size() > 0) {
            answerTemp.sort((a1, a2) -> a1 - a2);
            int[] answer = new int[answerTemp.size()];
            for(int i = 0; i < answerTemp.size(); i++)
                answer[i] = answerTemp.get(i);
            return answer;
        } else {
            return new int[]{-1};
        }

    }
}
