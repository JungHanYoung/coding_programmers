package kakao2018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FailRate {

    class Fail {
        int stage;
        double rate;

        Fail(int stage, double rate) {
            this.stage = stage;
            this.rate = rate;
        }

        @Override
        public String toString() {
            return "Fail{" +
                    "stage=" + stage +
                    ", rate=" + rate +
                    '}';
        }
    }

    public int[] solution(int n, int[] stages) {

        int[] answer = new int[n];

        int[] temp = new int[n+1];

        List<Fail> list = new ArrayList<>();

        for(int stage : stages) {
            temp[stage-1]++;
        }

        int total = stages.length;

        for(int i = 0; i < temp.length - 1; i++) {
            int currentStage = i + 1;
            int reach = temp[i];

            if(reach == 0) {
                list.add(new Fail(currentStage, 0));
            } else {
                list.add(new Fail(currentStage, (double)reach/total));
                total -= reach;
            }

        }

        Collections.sort(list, (f1, f2) -> {
            if(f1.rate == f2.rate) {
                return f1.stage - f2.stage;
            } else {
                if(f1.rate < f2.rate) return 1;
                if(f1.rate > f2.rate) return -1;
                else return 0;
            }
        });

        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i).stage;
        }

        return answer;
    }
}
